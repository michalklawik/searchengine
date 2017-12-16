package com.infoshareacademy.searchengine.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

@WebFilter(
        filterName = "SalaryIncrementFilter",
        urlPatterns = {"/welcome-user"},
        initParams = {
                @WebInitParam(name="minSalary", value="2000")
        }
)
public class SalaryIncrementFilter implements Filter {

    double minSalary;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        minSalary = Double.parseDouble(filterConfig.getInitParameter("minSalary"));
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String reqSalary = servletRequest.getParameter("salary");
        if (reqSalary == null || reqSalary.isEmpty()){
            reqSalary = "0.0";
        }

        double salary = Double.parseDouble(reqSalary);
        if (salary < 100) {
            salary = minSalary;
        }
        servletRequest.setAttribute("salary", salary);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        minSalary = 0.0;
    }
}

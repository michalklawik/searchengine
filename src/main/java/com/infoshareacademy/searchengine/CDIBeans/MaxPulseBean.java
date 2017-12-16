package com.infoshareacademy.searchengine.CDIBeans;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class MaxPulseBean implements MaxPulse {

    @Override
    public double calculateMaxPulseForMan(int age) {
        return 202-(0.55*age);
    }

    @Override
    public double calculateMaxPulseForWoman(int age) {
        return 216-(1.09*age);
    }
}

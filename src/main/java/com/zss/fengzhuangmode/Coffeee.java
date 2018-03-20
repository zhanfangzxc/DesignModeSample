package com.zss.fengzhuangmode;

public class Coffeee extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void brew() {
        System.out.println("Adding Sugar and Milk");
    }
}

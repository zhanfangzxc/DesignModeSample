package com.zss.fengzhuangmode;

public class Teaa extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void brew() {
        System.out.println("Adding Lemon");
    }
}

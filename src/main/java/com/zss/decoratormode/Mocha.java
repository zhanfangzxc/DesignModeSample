package com.zss.decoratormode;

/**
 * 第一种装饰者
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    /**
     * 用一个实例记录被装饰者
     * @param beverage
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}

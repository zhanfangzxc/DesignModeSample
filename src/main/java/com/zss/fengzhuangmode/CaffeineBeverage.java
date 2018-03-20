package com.zss.fengzhuangmode;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customeWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * 钩子函数：子类可以覆盖该方法，但不见得一定要这么做
     *
     * @return
     */
    boolean customeWantsCondiments() {
        return true;
    }
}

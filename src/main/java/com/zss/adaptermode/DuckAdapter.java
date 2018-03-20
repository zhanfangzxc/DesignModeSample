package com.zss.adaptermode;

public class DuckAdapter {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    public void quake() {
        duck.quack();
    }

    public void fly() {
        duck.fly();
    }
}

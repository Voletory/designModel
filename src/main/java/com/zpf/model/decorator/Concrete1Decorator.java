package com.zpf.model.decorator;

public class Concrete1Decorator extends Decorator {

    public Concrete1Decorator(Component component) {
        super(component);
    }

    private void method1() {
        System.out.println("装饰方法1");
    }

    @Override
    protected void operate() {
        this.method1();
        super.operate();
    }
}

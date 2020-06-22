package com.zpf.model.decorator;

public class Concrete2Decorator extends Decorator {
    public Concrete2Decorator(Component component) {
        super(component);
    }

    private void method2() {
        System.out.println("装饰方法2");
    }

    @Override
    protected void operate() {
        this.method2();
        super.operate();
    }
}

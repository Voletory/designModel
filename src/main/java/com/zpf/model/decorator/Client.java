package com.zpf.model.decorator;

public class Client {
    public static void main(String[] args) {
        Component component = new Concrete1Decorator(new Concrete2Decorator(new ConcreteComponent()));
        component.operate();
    }
}

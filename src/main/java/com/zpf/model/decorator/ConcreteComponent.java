package com.zpf.model.decorator;

public class ConcreteComponent extends Component {
    @Override
    protected void operate() {
        System.out.println("do Something");
    }
}

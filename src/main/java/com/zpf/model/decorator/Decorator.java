package com.zpf.model.decorator;

public abstract class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    protected void operate() {
        this.component.operate();
    }
}

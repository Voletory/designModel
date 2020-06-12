package com.zpf.model.mediator.fix;

/**
 * @author steven.zhu 2020/6/9 19:51.
 * @类描述：
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    public abstract void execute(String command, Object... objects);
}

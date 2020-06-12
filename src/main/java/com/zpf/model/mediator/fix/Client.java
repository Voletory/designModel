package com.zpf.model.mediator.fix;


/**
 * @author steven.zhu 2020/6/9 20:05.
 * @类描述：
 */
public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);
        System.out.println("-----销售人员销售电脑");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        System.out.println("----库房管理人员清库");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}

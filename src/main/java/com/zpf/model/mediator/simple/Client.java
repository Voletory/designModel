package com.zpf.model.mediator.simple;

/**
 * @author steven.zhu 2020/6/9 19:29.
 * @类描述：
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("---------采购人员采购电脑");
        Purchase purchase = new Purchase();
        purchase.buyIBMComputer(100);
        System.out.println("-----销售人员销售电脑");
        Sale sale = new Sale();
        sale.sellIBMComputer(1);
        System.out.println("----库房管理人员清库");
        Stock stock = new Stock();
        stock.clearStock();
    }
}

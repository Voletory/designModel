package com.zpf.model.mediator.simple;

/**
 * @author steven.zhu 2020/6/9 19:18.
 * @类描述：
 */
public class Stock {
    private static int COMPUTER_NUMBER = 100;

    public void increase(int number) {
        COMPUTER_NUMBER += number;
        System.out.println("库存数量为" + COMPUTER_NUMBER);
    }

    public void decrease(int number) {
        COMPUTER_NUMBER-=number;
        System.out.println("库存数量为" + COMPUTER_NUMBER);
    }

    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    public void clearStock() {
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        sale.offSale();
        purchase.refuseBuyIBM();
    }
}

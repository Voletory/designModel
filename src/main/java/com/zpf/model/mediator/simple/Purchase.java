package com.zpf.model.mediator.simple;

/**
 * @author steven.zhu 2020/6/9 19:18.
 * @类描述：
 */
public class Purchase {
    public void buyIBMComputer(int number) {
        Stock stock = new Stock();
        Sale sale = new Sale();
        if (sale.getSaleStatus() > 80) {
            stock.increase(number);
        } else {
            stock.increase(number / 2);
        }
    }

    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}

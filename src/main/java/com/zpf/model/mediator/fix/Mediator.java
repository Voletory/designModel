package com.zpf.model.mediator.fix;

import com.zpf.model.mediator.simple.Purchase;
import com.zpf.model.mediator.simple.Stock;

/**
 * @author steven.zhu 2020/6/9 19:53.
 * @类描述：
 */
public class Mediator extends AbstractMediator {
    public void execute(String command, Object... objects) {
        switch (command) {
            case "purchase.buy": this.buyComputer((Integer) objects[0]);break;
            case "sale.sell": this.sellComputer((Integer) objects[0]);break;
            case "sale.offsell": this.offSell();break;
            case "stock.clear": this.clearStock();break;
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑:" + number + "台");
            super.stock.increase(number);
        } else {
            System.out.println("采购IBM电脑:" + number / 2 + "台");
            stock.increase(number / 2);
        }
    }

    private void sellComputer(int number) {
        if (super.stock.getStockNumber() < number) {
            super.purchase.buyIBMComputer(number);
        }
        System.out.println("销售IBM电脑" + number + "台");
        super.stock.decrease(number);
    }

    private void offSell() {
        System.out.println("折价销售IBM电脑" + super.stock.getStockNumber() + "台");
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}

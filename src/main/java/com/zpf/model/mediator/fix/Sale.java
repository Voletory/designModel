package com.zpf.model.mediator.fix;

import java.util.Random;

/**
 * @author steven.zhu 2020/6/9 19:19.
 * @类描述：
 */
public class Sale extends AbstractColleague{
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sellIBMComputer(int number) {
        super.mediator.execute("sale.sell",number);
    }

    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM销售情况为:" + saleStatus);
        return saleStatus;
    }

    public void offSale() {
        super.mediator.execute("sale.offsell");
    }

}

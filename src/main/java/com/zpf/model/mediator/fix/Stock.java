package com.zpf.model.mediator.fix;

/**
 * @author steven.zhu 2020/6/9 19:18.
 * @类描述：
 */
public class Stock extends AbstractColleague{
    private static int COMPUTER_NUMBER = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

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
        super.mediator.execute("stock.clear");
    }
}

package com.zpf.model.mediator.fix;

/**
 * @author steven.zhu 2020/6/9 19:18.
 * @类描述：
 */
public class Purchase extends AbstractColleague{

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyIBMComputer(int number) {
        super.mediator.execute("purchase.buy",number);
    }

    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}

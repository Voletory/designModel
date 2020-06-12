package com.zpf.model.mediator.fix;

/**
 * @author steven.zhu 2020/6/9 19:58.
 * @类描述：
 */
public class AbstractColleague {
    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}

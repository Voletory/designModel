package com.zpf.model.chain;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author steven.zhu 2020/6/12 18:27.
 * @类描述：
 */
public abstract class IHandler {
    private IHandler next;

    public void setNext(IHandler next) {
        this.next = next;
    }

    public final Response handlerRequest() {
        return null;
    }

    protected abstract void exec();

}

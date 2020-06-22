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

    public final Response handlerRequest(Request request) {
        Response response = null;
        if (this.getHandleLevel() == request.getLevel()) {
            response = exec(request);
        } else if (next != null) {
            return next.handlerRequest(request);
        } else {
            System.out.println("无法处理请求，参数异常");
        }
        return response;
    }

    protected abstract Response exec(Request request);

    public abstract int getHandleLevel();

}

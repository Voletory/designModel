package com.zpf.model.chain;

public class Concrete2Handler extends IHandler{
    @Override
    protected Response exec(Request request) {
        Response response = new Response();
        return response;
    }

    @Override
    public int getHandleLevel() {
        return 0;
    }
}

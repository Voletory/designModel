package com.zpf.model.chain;

public class Client {
    public static void main(String[] args) {
        IHandler handler = new ConcreteHandler();
        handler.setNext(new Concrete2Handler());

        Request request = new Request();
        Response response = handler.handlerRequest(request);
    }
}

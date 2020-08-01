package com.zpf.model.factory;

public abstract class Create {
    /**
     * 创建一个产品对象，其输入参数可以自行调整
     * 通常为String,Enum,Class等，当然也可以为空
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}

package com.zpf.model.factory;

/**
 * 工厂类没必要创建的情况可以把创建方法定义为静态，并且使用一个类，不需要继承 静态工厂模式
 * 如果初始化不同对象不仅仅是实例化还需要许多其他步骤较麻烦的时候，可以使用多工厂模式，我们可以为每一个产品定义一个创造者  多工厂模式
 * 单例工厂模式
 *
 */
public class ConcreteCreate extends Create {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product= (Product) Class.forName(c.getName()).newInstance();
        }catch (Exception e) {
            //异常处理
        }
        return (T) product;
    }
}

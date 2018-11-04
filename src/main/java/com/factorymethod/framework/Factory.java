package com.factorymethod.framework;

/**
 * @description: 工厂抽象类（框架）
 * @author: 安琪
 * @create: 2018-11-04 18:47
 */
public abstract class Factory {

    /**
     * 工厂框架类的TemplateMethod，用于设置创建对象的流程
     * @param owner
     * @return
     */
    public final Product creat(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    /**
     * 创建对象方法
     * @param owner
     * @return
     */
    public abstract Product createProduct(String owner);

    /**
     * 注册对象方法
     * @param product
     */
    public abstract void registerProduct(Product product);

}

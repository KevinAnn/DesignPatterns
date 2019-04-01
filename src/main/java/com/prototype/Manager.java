package com.prototype;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;

/**
 * @description: 管理类，实现Product中的赋值方法
 * @author: 安琪
 * @create: 2019-04-01 07:42
 */
public class Manager {

    private HashMap showCase = new HashMap();

    /**
     * 通过注册保存实例
     * @param name
     * @param proto
     */
    public void register(String name, Product proto) {
        showCase.put(name, proto);
    }

    /**
     * 将保存的实例进行复制
     * @param protoName
     * @return
     */
    public Product create(String protoName) {
        Product p = (Product) showCase.get(protoName);
        return p.createClone();
    }

}

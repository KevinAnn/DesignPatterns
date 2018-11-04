package com.factorymethod;

import com.factorymethod.framework.Product;

/**
 * @description: ID卡产品类（具体）
 * @author: 安琪
 * @create: 2018-11-04 18:59
 */
public class IDCard extends Product {

    /**
     * ID卡拥有者
     */
    private String owner;

    /**
     * 含参构造方法，接收ID卡拥有者
     * @param owner
     */
    public IDCard(String owner) {
        System.out.println(owner + "的ID卡");
        this.owner = owner;
    }

    /**
     * 使用ID卡（打印使用信息）
     */
    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    /**
     * 获取ID卡拥有者
     * @return
     */
    public String getOwner() {
        return owner;
    }

}

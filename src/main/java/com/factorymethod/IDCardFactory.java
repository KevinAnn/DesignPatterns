package com.factorymethod;

import com.factorymethod.framework.Factory;
import com.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: ID卡工厂类（具体）
 * @author: 安琪
 * @create: 2018-11-04 19:04
 */
public class IDCardFactory extends Factory {

    /**
     * 所有ID卡拥有者
     */
    private List owners = new ArrayList();

    /**
     * 生产ID卡
     * @param owner
     * @return
     */
    @Override
    public Product createProduct(String owner) {
        System.out.println("制作" + owner + "的ID卡");
        return new IDCard(owner);
    }

    /**
     * 注册ID卡（增加拥有者信息）
     * @param product
     */
    @Override
    public void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    /**
     * 获得ID卡的拥有者
     * @return
     */
    public List getOwners() {
        return owners;
    }

}

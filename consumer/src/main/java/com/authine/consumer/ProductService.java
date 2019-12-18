package com.authine.consumer;

public interface ProductService {

    /**
     * 获得总消费
     * @param a
     * @return
     */
    Integer getCost(int a);

    /**
     * 获取名字接口
     * @param name
     * @return
     */
    String getName(String name);
}
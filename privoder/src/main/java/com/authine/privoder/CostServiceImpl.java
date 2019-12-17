package com.authine.privoder;

import com.alibaba.dubbo.config.annotation.Service;
import com.authine.api.CostService;

/**
 * 花费服务
 */
@Service
public class CostServiceImpl implements CostService {

    /**
     * 假设之前总花费了100
     */
    private final Integer totalCost = 1000;

    /**
     * 之前总和 加上 最近一笔
     * @param cost
     * @return
     */
    @Override
    public Integer add(int cost) {
        return totalCost + cost;
    }
}
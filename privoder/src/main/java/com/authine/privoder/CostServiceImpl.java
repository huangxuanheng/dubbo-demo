package com.authine.privoder;

import com.alibaba.dubbo.config.annotation.Service;
import com.authine.api.CostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

/**
 * 花费服务
 */
@Service
@Slf4j
public class CostServiceImpl implements CostService {


    /**
     * 假设之前总花费了100
     */
    private final Integer totalCost = 1000;

    @Value("${server.port}")
    private String port;
    /**
     * 之前总和 加上 最近一笔
     * @param cost
     * @return
     */
    @Override
    public Integer add(int cost) {
        log.info("当前调用的服务端口号是：{}",port);
        return totalCost + cost;
    }

}
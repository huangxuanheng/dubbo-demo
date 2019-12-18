package com.authine.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.cluster.loadbalance.RoundRobinLoadBalance;

import com.alibaba.dubbo.rpc.cluster.support.FailsafeCluster;
import com.authine.api.CostService;
import com.authine.api.RemoteService;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {


    /**
     * 使用dubbo的注解 com.alibaba.dubbo.config.annotation.Reference。进行远程调用service
     */
    @Reference(loadbalance = RoundRobinLoadBalance.NAME)
    private CostService costService;

    @Reference(cluster = FailsafeCluster.NAME,retries = 2)
    private RemoteService remoteService;
    @Override
    public Integer getCost(int a) {
        return costService.add(a);
    }

    @Override
    public String getName(String name) {
        return remoteService.getName(name);
    }
}
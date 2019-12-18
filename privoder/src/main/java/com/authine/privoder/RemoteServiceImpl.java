package com.authine.privoder;

import com.alibaba.dubbo.config.annotation.Service;
import com.authine.api.RemoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author harry
 * @Date 2019/12/18 14:29
 * email huangxuanheng@163.com
 * @des
 */
@Service
@Slf4j
public class RemoteServiceImpl implements RemoteService {

    @Value("${server.port}")
    private String port;
    private int count;
    @Override
    public String getName(String name) {
        ++count;
        log.info("RemoteServiceImpl当前调用的服务端口号是：{},调用次数是{}",port,count);
        if(count%3==0){
            throw new RuntimeException("我是故意抛出的异常");
        }
        return "我是："+name+",当前的端口号是:"+port+",从启动以来被访问的次数是："+count;
    }
}

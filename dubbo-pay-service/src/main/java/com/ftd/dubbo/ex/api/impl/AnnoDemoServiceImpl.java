package com.ftd.dubbo.ex.api.impl;

import com.ftd.dubbo.ex.api.AnnoDemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author xiaos
 * @date 2019/11/29 14:19
 */
@Service
public class AnnoDemoServiceImpl implements AnnoDemoService {
    @Override
    public String sayHello(String name) {
        return "anno say hello";
    }
}

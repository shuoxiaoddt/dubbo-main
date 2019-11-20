package com.ftd.dubbo.ex.api.impl;

import com.ftd.dubbo.ex.api.DemoService;

/**
 * @author xiaos
 * @date 2019/11/20 18:51
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
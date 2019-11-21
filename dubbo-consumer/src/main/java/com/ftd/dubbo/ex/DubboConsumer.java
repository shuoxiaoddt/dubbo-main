package com.ftd.dubbo.ex;

import com.ftd.dubbo.ex.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class DubboConsumer
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();
        DemoService bean = context.getBean(DemoService.class);
        System.out.println(bean.sayHello("hello"));;
    }
}

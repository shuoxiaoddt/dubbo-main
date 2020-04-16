package com.ftd.dubbo.ex;

import com.ftd.dubbo.ex.action.AnnotationAction;
import com.ftd.dubbo.ex.conf.ConsumerConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiaos
 * @date 2019/11/29 14:48
 */
public class AnnoServiceConsumer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        final AnnotationAction annotationAction = (AnnotationAction) context.getBean("annotationAction");

        System.out.println("hello : " + annotationAction.doSayHello("world"));
        System.out.println("greeting : " + annotationAction.doGreeting("world"));
        System.out.println("reply : " + annotationAction.replyGreeting("world"));
    }
}

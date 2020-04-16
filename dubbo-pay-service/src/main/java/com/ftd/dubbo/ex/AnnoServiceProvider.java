package com.ftd.dubbo.ex;

import com.ftd.dubbo.ex.conf.ConsumerConfiguration;
import com.ftd.dubbo.ex.conf.ProviderConfiguration;
import com.ftd.dubbo.ex.embed.EmbeddedZooKeeper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * @author xiaos
 * @date 2019/11/29 14:48
 */
public class AnnoServiceProvider {
    public static void main(String[] args) {
        new EmbeddedZooKeeper(2181, false).start();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();

        System.out.println("dubbo service started.");
        try {
            new CountDownLatch(1).await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.ftd.dubbo.ex.conf;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author xiaos
 * @date 2019/11/29 14:49
 */
@Configuration
@PropertySource("classpath:/dubbo-consumer.properties")
@EnableDubbo(scanBasePackages = "com.ftd.dubbo.ex.action")
@ComponentScan(value = {"com.ftd.dubbo.ex"})
public class ConsumerConfiguration {
}

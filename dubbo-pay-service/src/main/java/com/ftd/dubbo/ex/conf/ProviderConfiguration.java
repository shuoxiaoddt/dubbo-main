package com.ftd.dubbo.ex.conf;

import org.apache.dubbo.config.ProviderConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author xiaos
 * @date 2019/11/29 14:49
 */
@Configuration
@PropertySource("classpath:/dubbo-provider.properties")
@EnableDubbo(scanBasePackages = "com.ftd.dubbo.ex.api.impl")
public class ProviderConfiguration {

    @Bean
    public ProviderConfig providerConfig() {
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setTimeout(1000);
        return providerConfig;
    }
}

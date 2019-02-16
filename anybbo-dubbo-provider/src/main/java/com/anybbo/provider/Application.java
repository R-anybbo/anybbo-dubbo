package com.anybbo.provider;

import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: Huopengbo
 * @data: 2019/02/16
 * @time: 10:31
 */
public class Application {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.out.println("Dubbo provider is starting...");
        System.in.read();
    }

    @Configuration
    @EnableDubbo(scanBasePackages = "com.anybbo.provider.impl")
    @PropertySource("classpath:/spring/dubbo-provider.properties")
    static public class ProviderConfiguration {

//        @Bean
//        public RegistryConfig registryConfig() {
//            RegistryConfig registryConfig = new RegistryConfig();
//            registryConfig.setProtocol("zookeeper");
//            registryConfig.setAddress("127.0.0.1");
//            registryConfig.setPort(2181);
//            return registryConfig;
//        }
//
//        @Bean
//        public ProtocolConfig protocolConfig() {
//            ProtocolConfig protocolConfig = new ProtocolConfig();
//            protocolConfig.setName("dubbo");
//            protocolConfig.setPort(20880);
//            return protocolConfig;
//        }
//
//        @Bean
//        public ProviderConfig providerConfig() {
//            ProviderConfig providerConfig = new ProviderConfig();
//            providerConfig.setTimeout(1000);
//            return providerConfig;
//        }

    }

}

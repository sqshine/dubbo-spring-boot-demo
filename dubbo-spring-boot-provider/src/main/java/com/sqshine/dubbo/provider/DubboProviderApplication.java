package com.sqshine.dubbo.provider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author sqshine
 */
@SpringBootApplication
@DubboComponentScan
public class DubboProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(DubboProviderApplication.class).web(WebApplicationType.NONE).run(args);

    }
}

package com.demo.application.config;

import io.quarkus.arc.config.ConfigProperties;

@ConfigProperties(prefix = "my")
public interface TestInterfaceConfigProperties {

    String test();

}

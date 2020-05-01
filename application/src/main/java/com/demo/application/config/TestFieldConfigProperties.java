package com.demo.application.config;

import io.quarkus.arc.config.ConfigProperties;
import lombok.Data;

@Data
@ConfigProperties(prefix = "my")
public class TestFieldConfigProperties {

    String test;

}

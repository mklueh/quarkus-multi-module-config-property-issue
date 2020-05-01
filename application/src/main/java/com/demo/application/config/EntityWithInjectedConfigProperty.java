package com.demo.application.config;

import lombok.Data;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

@Data
@ApplicationScoped
public class EntityWithInjectedConfigProperty {

    @ConfigProperty(name = "my.test")
    String test;

    @ConfigProperty(name = "my.test")
    Optional<String> optionalTest;

}

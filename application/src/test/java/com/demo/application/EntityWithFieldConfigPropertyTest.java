package com.demo.application;

import com.demo.application.config.EntityWithInjectedConfigProperty;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
public class EntityWithFieldConfigPropertyTest {

    @Inject
    EntityWithInjectedConfigProperty testFieldConfigProperties;

    @Test
    void testConfigNotNull() {
        assertNotNull(testFieldConfigProperties);
    }

    @Test
    void testConfigValuesNotNull() {
        assertNotNull(testFieldConfigProperties.getTest());
    }

}

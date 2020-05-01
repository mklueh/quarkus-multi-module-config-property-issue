package com.demo.application;

import com.demo.application.config.TestInterfaceConfigProperties;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
public class InterfaceConfigPropertiesTest {

    @Inject
    TestInterfaceConfigProperties testFieldConfigProperties;

    @Test
    void testConfigNotNull() {
        assertNotNull(testFieldConfigProperties);
    }

    @Test
    void testConfigValuesNotNull() {
        assertNotNull(testFieldConfigProperties.test());
    }

}

package com.demo.application;

import com.demo.application.config.TestFieldConfigProperties;
import io.quarkus.scheduler.Scheduled;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Slf4j
@ApplicationScoped
public class Application {

    @Inject
    TestFieldConfigProperties testFieldConfigProperties;

    @Scheduled(every = "{scheduler.cron}")
    public void schedule() {
        log.info(testFieldConfigProperties.getTest());
    }

}

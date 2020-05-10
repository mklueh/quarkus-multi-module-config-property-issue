package com.demo.application;

import com.demo.application.config.TestFieldConfigProperties;
import io.quarkus.runtime.StartupEvent;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@Slf4j
@ApplicationScoped
public class Application {

    @Inject
    TestFieldConfigProperties testFieldConfigProperties;

    /**
     * Won´t work with quarkusDev
     */
    void onStart(@Observes StartupEvent ev) {
        log.info(testFieldConfigProperties.getTest());
    }

    /**
     * TODO this won´t work as well,
     * we leave it disabled for now to verify
     * TestFieldConfigProperties
     */
    //@Scheduled(every = "{scheduler.cron}")
    public void schedule() {
        log.info(testFieldConfigProperties.getTest());
    }

}

package com.begodly.providedjar;

import org.apache.commons.logging.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.boot.logging.DeferredLogFactory;
import org.springframework.core.env.ConfigurableEnvironment;

public class ProvidedJarLoggingStartup implements EnvironmentPostProcessor {
    private final Log log;

    public ProvidedJarLoggingStartup(DeferredLogFactory logFactory) {
        System.out.println(">> LOGGING");
        log = logFactory.getLog(getClass());
    }

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        log.info("** WORKING!!");
    }
}

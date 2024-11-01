package com.begodly.webentrypoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.begodly")
public class WebEntrypointApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebEntrypointApplication.class, args);
    }

}

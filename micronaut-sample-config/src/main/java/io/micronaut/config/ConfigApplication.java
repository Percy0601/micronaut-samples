package io.micronaut.config;

import io.micronaut.config.service.Engine;
import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;

public class ConfigApplication {

    public static void main(String[] args) {
        ApplicationContext context =  Micronaut.run(ConfigApplication.class);

        Engine engine = context.getBean(Engine.class);
    }
}
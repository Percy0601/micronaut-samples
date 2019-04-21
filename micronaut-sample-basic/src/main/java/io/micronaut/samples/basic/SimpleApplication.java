package io.micronaut.samples.basic;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;

public class SimpleApplication {
    private static ApplicationContext applicationContext;
    public static void main(String[] args) {
        applicationContext = Micronaut.run(SimpleApplication.class);
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}

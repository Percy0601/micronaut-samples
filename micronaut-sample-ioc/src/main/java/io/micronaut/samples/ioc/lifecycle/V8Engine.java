package io.micronaut.samples.ioc.lifecycle;

import io.micronaut.samples.ioc.basic.Engine;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;

@Singleton
public class V8Engine implements Engine {
    int cylinders = 8;
    boolean initialized = false;

    @Override
    public int getCylinders() {
        return cylinders;
    }

    public String start() {
        if(!initialized) throw new IllegalStateException("Engine not initialized!");

        return "Starting V8";
    }

    @PostConstruct
    void initialize() {
        this.initialized = true;
    }
}

package io.micronaut.config.service;

import io.micronaut.context.annotation.Value;

public class EngineImpl implements Engine{

    @Value("${my.engine.cylinders:6}")
    protected int cylinders;

    @Override
    public int getCylinders() {
        return this.cylinders;
    }

}

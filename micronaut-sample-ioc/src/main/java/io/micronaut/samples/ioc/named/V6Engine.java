package io.micronaut.samples.ioc.named;

import io.micronaut.samples.ioc.basic.Engine;

import javax.inject.Singleton;

@Singleton
public class V6Engine implements Engine {
    @Override
    public int getCylinders() {
        return 6;
    }

    @Override
    public String start() {
        return "Starting V6";
    }
}

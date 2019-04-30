package io.micronaut.samples.ioc.event;

import io.micronaut.samples.ioc.basic.Engine;

public class V8Engine implements Engine {
    final int cylinders = 8;

    @Override
    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String start() {
        return "Engine Start!";
    }
}

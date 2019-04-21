package io.micronaut.samples.ioc.factory;

import io.micronaut.samples.ioc.basic.Engine;

public class V6Engine implements Engine {

    private final int cylinders = 6;
    private final CrankShaft crankShaft;

    public V6Engine(CrankShaft crankShaft) {
        this.crankShaft = crankShaft;
    }

    @Override
    public int getCylinders() {
        return this.cylinders;
    }

    @Override
    public String start() {
        return "Starting V6";
    }
}

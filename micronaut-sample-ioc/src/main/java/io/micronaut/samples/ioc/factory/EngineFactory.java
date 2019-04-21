package io.micronaut.samples.ioc.factory;

import io.micronaut.context.annotation.Factory;
import io.micronaut.samples.ioc.basic.Engine;

import javax.inject.Singleton;

@Factory
public class EngineFactory {

    @Singleton
    Engine v6Engine(CrankShaft crankShaft) {
        return new V6Engine(crankShaft);
    }

}

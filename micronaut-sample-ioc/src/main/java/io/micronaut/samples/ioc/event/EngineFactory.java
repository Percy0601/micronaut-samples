package io.micronaut.samples.ioc.event;

import io.micronaut.context.annotation.Factory;
import io.micronaut.samples.ioc.basic.Engine;
import lombok.Data;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;

@Data
@Factory
public class EngineFactory {

    private V8Engine engine;
    private double rodLength;

    @PostConstruct
    public void initialize() {
        engine = new V8Engine();
    }

    @Singleton
    public Engine v8Engine() {
        return engine;
    }

}

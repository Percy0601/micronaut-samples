package io.micronaut.samples.ioc.event;

import io.micronaut.context.event.BeanInitializedEventListener;
import io.micronaut.context.event.BeanInitializingEvent;

import javax.inject.Singleton;

@Singleton
public class EngineInitializer implements BeanInitializedEventListener<EngineFactory> {
    @Override
    public EngineFactory onInitialized(BeanInitializingEvent<EngineFactory> event) {
        EngineFactory engineFactory = event.getBean();
        engineFactory.setRodLength(6.6);
        return event.getBean();
    }
}

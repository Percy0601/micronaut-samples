package io.micronaut.samples.ioc.lifecycle;

import javax.annotation.PreDestroy;
import javax.inject.Singleton;
import java.util.concurrent.atomic.AtomicBoolean;

@Singleton
public class PreDestroyBean implements AutoCloseable {

    AtomicBoolean stopped = new AtomicBoolean(false);

    @PreDestroy
    @Override
    public void close() {
        stopped.compareAndSet(false, true);
    }
}

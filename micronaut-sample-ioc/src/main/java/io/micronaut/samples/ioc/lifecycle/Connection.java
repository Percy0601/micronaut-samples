package io.micronaut.samples.ioc.lifecycle;

import java.util.concurrent.atomic.AtomicBoolean;

public class Connection {
    AtomicBoolean stopped = new AtomicBoolean(false);

    public void stop() {
        stopped.compareAndSet(false, true);
    }
}

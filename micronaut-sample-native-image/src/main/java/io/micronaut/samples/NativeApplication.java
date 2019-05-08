package io.micronaut.samples;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NativeApplication {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ApplicationContext context = Micronaut.run(NativeApplication.class);
        long end = System.currentTimeMillis();
        log.info("start time:{}", (end - start));
    }
}
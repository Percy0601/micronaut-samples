package io.micronaut.config;

import io.micronaut.config.properties.EngineConfig;
import io.micronaut.config.service.Engine;
import io.micronaut.test.annotation.MicronautTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@Slf4j
@MicronautTest
public class ConfigApplicationTest {


    @Inject
    Engine engine;
    @Inject
    EngineConfig engineConfig;

    @Test
    public void test() {
        log.info("================={}", engine.getCylinders());
    }

    @Test
    public void testProperties() {
        log.info("==============={}", engineConfig);
    }

}

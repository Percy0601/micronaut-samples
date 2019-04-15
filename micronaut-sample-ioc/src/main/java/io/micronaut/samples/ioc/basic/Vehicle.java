package io.micronaut.samples.ioc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;

/**
 * 车辆
 *
 */
@Singleton
public class Vehicle {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    /**
     * 车辆引擎<br>
     * 自动注入
     *
     */
    final Engine engine;

    /**
     * 构造方法注入
     *
     * @param engine
     */
    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public String start() {
        log.info("车辆启动。。。");
        return engine.start();
    }

}

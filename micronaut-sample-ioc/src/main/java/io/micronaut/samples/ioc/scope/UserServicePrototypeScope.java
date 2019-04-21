package io.micronaut.samples.ioc.scope;


import io.micronaut.context.annotation.Prototype;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Singleton;

/**
 * 使用@Singleton延迟加载，如果想ApplicationContext创建时加载使用@Context
 *
 *
 */
@Slf4j
@Prototype
public class UserServicePrototypeScope {

    public UserServicePrototypeScope() {
        log.info("=========UserService Prototype Init=========");
    }


    public String hello(String name) {
        return "Hello: " + name;
    }
}

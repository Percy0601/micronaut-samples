package io.micronaut.samples.ioc.scope;


import lombok.extern.slf4j.Slf4j;

import javax.inject.Singleton;

/**
 * 使用@Singleton延迟加载，如果想ApplicationContext创建时加载使用@Context
 *
 *
 */
@Slf4j
@Singleton
public class UserService {

    public UserService() {
        log.info("=========UserService Init=========");
    }


    public String hello(String name) {
        return "Hello: " + name;
    }
}

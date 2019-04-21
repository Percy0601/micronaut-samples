package io.micronaut.samples.ioc.scope;


import io.micronaut.context.annotation.Context;
import lombok.extern.slf4j.Slf4j;

/**
 * 使用@Singleton延迟加载，如果想ApplicationContext创建时加载使用@Context
 *
 *
 */
@Slf4j
@Context
public class UserServiceContextScope {

    public UserServiceContextScope() {
        log.info("=========UserService Context Init=========");
    }


    public String hello(String name) {
        return "Hello: " + name;
    }
}

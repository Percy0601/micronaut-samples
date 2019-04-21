package io.micronaut.samples.ioc.test;

import io.micronaut.context.ApplicationContext;
import io.micronaut.context.BeanContext;
import io.micronaut.samples.ioc.basic.MyBean;
import io.micronaut.samples.ioc.basic.Vehicle;
import io.micronaut.samples.ioc.scope.UserService;
import io.micronaut.samples.ioc.scope.UserServicePrototypeScope;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ApplicationTest {

    /**
     * 使用最原始的方式获取
     *
     */
    public static void applicationContext() {
        try (ApplicationContext context = ApplicationContext.run()) {
            MyBean myBean = context.getBean(MyBean.class);
            myBean.setAge(30);
        }
    }

    public static void beanContext() {
        Vehicle vehicle = BeanContext.run()
                .getBean(Vehicle.class);
        log.info("================{}", vehicle.start());
    }


    public static void beanContextNamed() {
        io.micronaut.samples.ioc.named.Vehicle vehicle = BeanContext.run()
                .getBean(io.micronaut.samples.ioc.named.Vehicle.class);
        log.info("================{}", vehicle.start());
    }

    /**
     * scope-singleton
     */
    public static void beanContextSingleton() {
        BeanContext beanContext = BeanContext.run();

        Runnable runnable = () -> {
            UserService userService = beanContext.getBean(UserService.class);
            log.info("================{}", userService.hello("Percy"));
        };


        for(int i = 0; i < 5; i++) {
            new Thread(runnable).start();
        }
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * scope-singleton
     */
    public static void beanContextSingletonNotInit() {
        BeanContext beanContext = BeanContext.run();
    }

    @Test
    public void tesBeanSingletonNotInit() {
        BeanContext beanContext = BeanContext.run();
    }

    /**
     * scope-prototype
     */
    @Test
    public void testBeanContextPrototype() {
        BeanContext beanContext = BeanContext.run();

        Runnable runnable = () -> {
            UserServicePrototypeScope userService = beanContext.getBean(UserServicePrototypeScope.class);
            log.info("================{}", userService.hello("Percy"));
        };


        for(int i = 0; i < 5; i++) {
            new Thread(runnable).start();
        }
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

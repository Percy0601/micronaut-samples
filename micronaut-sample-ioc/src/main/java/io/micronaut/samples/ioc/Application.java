package io.micronaut.samples.ioc;


import io.micronaut.context.ApplicationContext;
import io.micronaut.context.BeanContext;
import io.micronaut.samples.ioc.basic.MyBean;
import io.micronaut.samples.ioc.basic.Vehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    private static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        //applicationContext();
        //beanContext();
        beanContextNamed();
    }

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

}

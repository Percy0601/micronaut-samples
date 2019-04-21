package io.micronaut.samples.ioc.meta;

import io.micronaut.context.annotation.Requires;

import javax.sql.DataSource;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PACKAGE, ElementType.TYPE})
@Requires(beans = DataSource.class)
@Requires(property = "datasource.url")
public @interface RequiresJdbc {
}

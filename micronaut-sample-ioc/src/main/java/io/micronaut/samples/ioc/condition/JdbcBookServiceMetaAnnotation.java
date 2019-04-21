package io.micronaut.samples.ioc.condition;

import io.micronaut.context.annotation.Requires;
import io.micronaut.samples.ioc.meta.RequiresJdbc;

import javax.inject.Singleton;
import javax.sql.DataSource;

@RequiresJdbc
public class JdbcBookServiceMetaAnnotation implements BookService{

    DataSource dataSource;

    public JdbcBookServiceMetaAnnotation(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Book findBook(String title) {
        return null;
    }
}

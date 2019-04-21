package io.micronaut.samples.ioc.condition;

import io.micronaut.context.annotation.Requires;

import javax.inject.Singleton;
import javax.sql.DataSource;

@Singleton
@Requires(beans = DataSource.class)
@Requires(property = "datasource.url")
public class JdbcBookService implements BookService {

    DataSource dataSource;

    public JdbcBookService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Book findBook(String title) {
        return null;
    }
}

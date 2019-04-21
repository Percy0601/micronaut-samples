package io.micronaut.samples.ioc.factory;

import io.micronaut.context.annotation.Factory;
import io.micronaut.samples.ioc.condition.Book;
import io.micronaut.samples.ioc.condition.TextBook;

import javax.inject.Singleton;

@Factory
public class BookFactory {
    @Singleton
    Book novel() {
        return new Book("A Great Novel");
    }

    @Singleton
    TextBook textBook() {
        return new TextBook("Learning 101");
    }

}

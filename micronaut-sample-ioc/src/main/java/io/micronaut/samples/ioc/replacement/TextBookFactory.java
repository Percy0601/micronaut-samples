package io.micronaut.samples.ioc.replacement;

import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Replaces;
import io.micronaut.samples.ioc.condition.TextBook;
import io.micronaut.samples.ioc.factory.BookFactory;

import javax.inject.Singleton;

@Factory
public class TextBookFactory {

    @Singleton
    @Replaces(value = TextBook.class, factory = BookFactory.class)
    TextBook textBook() {
        return new TextBook("Learning 305");
    }

}

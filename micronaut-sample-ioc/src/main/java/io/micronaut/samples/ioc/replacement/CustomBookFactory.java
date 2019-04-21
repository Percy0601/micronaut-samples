package io.micronaut.samples.ioc.replacement;

import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Replaces;
import io.micronaut.samples.ioc.condition.Book;
import io.micronaut.samples.ioc.factory.BookFactory;

import javax.inject.Singleton;

@Factory
@Replaces(factory = BookFactory.class)
public class CustomBookFactory {

    @Singleton
    Book otherNovel() {
        return new Book("An OK Novel");
    }

}

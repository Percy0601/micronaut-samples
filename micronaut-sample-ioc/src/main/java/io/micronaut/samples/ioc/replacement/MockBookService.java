package io.micronaut.samples.ioc.replacement;

import io.micronaut.context.annotation.Replaces;
import io.micronaut.samples.ioc.condition.Book;
import io.micronaut.samples.ioc.condition.BookService;
import io.micronaut.samples.ioc.condition.JdbcBookService;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import java.util.LinkedHashMap;
import java.util.Map;

@Replaces(JdbcBookService.class)
@Singleton
public class MockBookService implements BookService {
    Map<String, Book> bookMap = new LinkedHashMap<>();

    @PostConstruct
    public void init() {
        Book book = new Book();
        book.setAuthor("fasdf");
        book.setTitle("fasdef");
        book.setId(1);
        bookMap.put("some", book);
    }
    @Override
    public Book findBook(String title) {
        return bookMap.get("title");
    }
}

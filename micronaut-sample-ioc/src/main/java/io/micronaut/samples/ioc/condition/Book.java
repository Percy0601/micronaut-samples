package io.micronaut.samples.ioc.condition;

import lombok.Data;

@Data
public class Book {
    private Integer id;
    private String title;
    private String author;

    public Book(String title) {
        this.title = title;
    }
}

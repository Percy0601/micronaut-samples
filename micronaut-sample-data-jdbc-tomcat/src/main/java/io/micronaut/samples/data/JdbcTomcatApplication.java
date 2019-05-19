package io.micronaut.samples.data;

import io.micronaut.runtime.Micronaut;

public class JdbcTomcatApplication {

    public static void main(String[] args) {
        Micronaut.run(JdbcTomcatApplication.class);
    }
}
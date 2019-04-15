package io.micronaut.samples.basic;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;

import javax.validation.constraints.NotBlank;

@Validated
@Controller("/")
public class HelloController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        return "Hello World";
    }

    @Get(uri="/hello/{name}", produces = MediaType.TEXT_PLAIN)
    public String hello(@NotBlank String name) {
        return "Hello " + name + "!";
    }

}

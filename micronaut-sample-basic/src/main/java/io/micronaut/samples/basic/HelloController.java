package io.micronaut.samples.basic;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.runtime.context.scope.refresh.RefreshEvent;
import io.micronaut.samples.basic.scope.WeatherService;
import io.micronaut.validation.Validated;

import javax.inject.Inject;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.NotBlank;

@Validated
@Controller("/")
public class HelloController {

    @Inject
    private WeatherService weatherService;

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        return "Hello World";
    }

    @Get(uri="/hello/{name}", produces = MediaType.TEXT_PLAIN)
    public String hello(@NotBlank String name) {
        return "Hello " + name + "!";
    }

    @Get(uri="/getDate", produces = MediaType.APPLICATION_JSON)
    public String getDate() {
        String date = weatherService.latestForecast();
        return date;
    }

    @Get(uri="/refreshAndGetDate", produces = MediaType.APPLICATION_JSON)
    public String refreshAndGetDate() {
        SimpleApplication.getApplicationContext().publishEvent(new RefreshEvent());
        String date = weatherService.latestForecast();
        return date;
    }
}

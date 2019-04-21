package io.micronaut.samples.basic.scope;

import io.micronaut.runtime.context.scope.Refreshable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;

@Refreshable
public class WeatherService {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    private String forecast;

    @PostConstruct
    public void init() {
        forecast = "Scattered Clouds " + new SimpleDateFormat("dd/MM/yy HH:mm:ss.SSS")
                .format(new Date());
        log.info("初始化系统:{}", forecast);
    }

    public String latestForecast() {
        return forecast;
    }

}

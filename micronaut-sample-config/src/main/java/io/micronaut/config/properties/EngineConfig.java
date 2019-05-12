package io.micronaut.config.properties;

import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Optional;

@Data
@ConfigurationProperties("my.engine")
public class EngineConfig {

    @NotBlank
    private String manufacturer = "Ford";

    @Min(1L)
    private int cylinders;

    CrankShaft crankShaft = new CrankShaft();

    @Data
    @ConfigurationProperties("crank-shaft")
    static class CrankShaft {
        Optional<Double> rodLength = Optional.empty();
    }

}

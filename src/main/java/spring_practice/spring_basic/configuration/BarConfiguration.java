package spring_practice.spring_basic.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_practice.spring_basic.data.Bar;

@Slf4j
@Configuration
public class BarConfiguration {

    @Bean
    public Bar bar() {
        log.info("Bar bean");
        return new Bar();
    }

}

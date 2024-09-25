package spring_practice.spring_basic.v11;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import spring_practice.spring_basic.configuration.BarConfiguration;
import spring_practice.spring_basic.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
}

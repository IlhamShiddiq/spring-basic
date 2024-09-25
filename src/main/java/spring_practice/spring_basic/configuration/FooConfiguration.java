package spring_practice.spring_basic.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import spring_practice.spring_basic.data.Foo;

@Slf4j
@Configuration
public class FooConfiguration {

    @Bean
    @Primary
    public Foo foo() {
        log.info("Foo bean");
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        log.info("Foo 2 bean");
        return new Foo();
    }

}

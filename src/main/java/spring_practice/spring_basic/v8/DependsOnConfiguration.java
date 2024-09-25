package spring_practice.spring_basic.v8;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import spring_practice.spring_basic.data.Bar;
import spring_practice.spring_basic.data.Foo;

@Slf4j
@Configuration
public class DependsOnConfiguration {

//    @Lazy
    @Bean
    @DependsOn({"bar"})
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Create new Bar");
        return new Bar();
    }
}

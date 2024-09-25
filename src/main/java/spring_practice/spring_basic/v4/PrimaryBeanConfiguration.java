package spring_practice.spring_basic.v4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import spring_practice.spring_basic.data.Foo;

@Configuration
public class PrimaryBeanConfiguration {

    @Primary
    @Bean
    public Foo foo1() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }
}

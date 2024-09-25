package spring_practice.spring_basic.v3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_practice.spring_basic.data.Foo;

@Configuration
public class BeanConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

}

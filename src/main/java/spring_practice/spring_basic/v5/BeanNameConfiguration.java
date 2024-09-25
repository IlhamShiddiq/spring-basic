package spring_practice.spring_basic.v5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import spring_practice.spring_basic.data.Foo;

@Configuration
public class BeanNameConfiguration {

    @Primary
    @Bean(name = "fooFirst")
    public Foo foo1() {
        return new Foo();
    }

    @Bean(value = "fooSecond")
    public Foo foo2() {
        return new Foo();
    }

}

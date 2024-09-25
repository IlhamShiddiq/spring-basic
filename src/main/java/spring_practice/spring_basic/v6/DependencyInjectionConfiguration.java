package spring_practice.spring_basic.v6;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import spring_practice.spring_basic.data.Bar;
import spring_practice.spring_basic.data.Foo;
import spring_practice.spring_basic.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {

    @Primary
    @Bean
    public Foo fooFirst() {
        return new Foo();
    }

    @Bean
    public Foo fooSecond() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    //    @Bean
    //    public FooBar fooBar(Foo foo, Bar bar) {
    //        return new FooBar(foo, bar);
    //    }

    // With custom bean
    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}

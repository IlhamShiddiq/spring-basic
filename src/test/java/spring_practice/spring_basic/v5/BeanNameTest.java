package spring_practice.spring_basic.v5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_practice.spring_basic.data.Foo;

public class BeanNameTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
    }

    @Test
    void testBeanName() {
        Foo foo1 = applicationContext.getBean("fooFirst", Foo.class);
        Foo foo2 = applicationContext.getBean("fooSecond", Foo.class);

        Assertions.assertNotSame(foo1, foo2);
    }
}

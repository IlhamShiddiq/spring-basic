package spring_practice.spring_basic.v21;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import spring_practice.spring_basic.data.Bar;
import spring_practice.spring_basic.data.Foo;
import spring_practice.spring_basic.listener.AppStartedListener;
import spring_practice.spring_basic.listener.AppStartingListener;

import java.util.List;

@SpringBootApplication
public class FooApplication {

    // Set Spring Application Automatically
//    public static void main(String[] args) {
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
//
//        Foo foo = applicationContext.getBean(Foo.class);
//        System.out.println(foo);
//    }

    // Set Spring Application Manually
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(FooApplication.class);
        application.setBannerMode(Banner.Mode.OFF);

        // Set Application Listener
        application.setListeners(
            List.of(
                new AppStartingListener(),
                new AppStartedListener()
            )
        );

        ConfigurableApplicationContext applicationContext = application.run(args);

        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);
    }

    @Bean
    public Foo foo() {
        return new Foo();
    }

}

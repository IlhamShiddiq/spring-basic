package spring_practice.spring_basic.v13;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "spring_practice.spring_basic.service",
        "spring_practice.spring_basic.repository",
        "spring_practice.spring_basic.configuration",
})
public class ComponentConfiguration {
}

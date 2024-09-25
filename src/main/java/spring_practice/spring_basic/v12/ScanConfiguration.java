package spring_practice.spring_basic.v12;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
    "spring_practice.spring_basic.configuration"
})
public class ScanConfiguration {
}

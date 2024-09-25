package spring_practice.spring_basic.v18;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import spring_practice.spring_basic.service.AuthService;

@Configuration
@Import({
        AuthService.class
})
public class AwareConfiguration {

}

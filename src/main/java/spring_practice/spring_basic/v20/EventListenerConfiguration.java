package spring_practice.spring_basic.v20;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import spring_practice.spring_basic.listener.LoginSuccessListener;
import spring_practice.spring_basic.listener.UserListener;
import spring_practice.spring_basic.service.UserService;

@Configuration
@Import({
    UserService.class,
    LoginSuccessListener.class,
    UserListener.class
})
public class EventListenerConfiguration {
}

package spring_practice.spring_basic.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import spring_practice.spring_basic.data.User;

public class LoginSuccessEvent extends ApplicationEvent {

    @Getter
    private final User user;

    public LoginSuccessEvent(User user) {
        super(user);
        this.user = user;
    }

}

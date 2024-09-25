package spring_practice.spring_basic.data;

import lombok.Getter;
import org.springframework.stereotype.Component;
import spring_practice.spring_basic.aware.IdAware;

@Component
public class Car implements IdAware {

    @Getter
    private String id;

    @Override
    public void setId(String id) {
        this.id = id;
    }
}

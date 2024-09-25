package spring_practice.spring_basic.v16;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import spring_practice.spring_basic.service.MerchantServiceImpl;

@Configuration
@Import({
        MerchantServiceImpl.class
})
public class InheritanceConfiguration {
}

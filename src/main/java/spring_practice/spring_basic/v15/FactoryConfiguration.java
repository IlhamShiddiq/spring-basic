package spring_practice.spring_basic.v15;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import spring_practice.spring_basic.factory.PaymentGatewayClientFactoryBean;

@Configuration
@Import({
        PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}

package spring_practice.spring_basic.v15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_practice.spring_basic.client.PaymentGatewayClient;

public class FactoryTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testFactory() {
        PaymentGatewayClient gatewayClient = applicationContext.getBean(PaymentGatewayClient.class);

        Assertions.assertNotNull(gatewayClient);
        Assertions.assertEquals("https://example.com", gatewayClient.getEndpoint());
        Assertions.assertEquals("private", gatewayClient.getPrivateKey());
        Assertions.assertEquals("public", gatewayClient.getPublicKey());
    }
}

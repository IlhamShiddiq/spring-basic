package spring_practice.spring_basic.v7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_practice.spring_basic.data.CyclicA;
import spring_practice.spring_basic.data.CyclicB;
import spring_practice.spring_basic.data.CyclicC;

@Configuration
public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB) {
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC) {
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA) {
        return new CyclicC(cyclicA);
    }
}

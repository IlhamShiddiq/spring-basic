package spring_practice.spring_basic.v17;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import spring_practice.spring_basic.data.Car;
import spring_practice.spring_basic.processor.IdGeneratorBeanProcessor;
import spring_practice.spring_basic.processor.PrefixIdGeneratorBeanPostProcessor;

@Configuration
@Import({
    Car.class,
    IdGeneratorBeanProcessor.class,
    PrefixIdGeneratorBeanPostProcessor.class,
})
public class BeanProcessorConfiguration {

    //

}

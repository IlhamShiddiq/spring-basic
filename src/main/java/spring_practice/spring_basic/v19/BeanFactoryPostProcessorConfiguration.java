package spring_practice.spring_basic.v19;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import spring_practice.spring_basic.processor.FooBeanFactoryPostProcessor;

@Configuration
@Import({
        FooBeanFactoryPostProcessor.class
})
public class BeanFactoryPostProcessorConfiguration {



}

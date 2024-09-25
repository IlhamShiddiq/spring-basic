package spring_practice.spring_basic.v10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_practice.spring_basic.data.Connection;
import spring_practice.spring_basic.data.Server;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

//    @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean()
    public Server server() {
        return new Server();
    }

}

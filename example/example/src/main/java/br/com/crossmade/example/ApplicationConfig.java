package br.com.crossmade.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class ApplicationConfig {

    @Bean
    @Qualifier("bean1")
    public MyFirstClass myFirstBean() {
        return new MyFirstClass("First Bean");
    }

    @Bean
    public MyFirstClass mySecondBean() {
        return new MyFirstClass("Second Bean");
    }

    @Bean
    @Profile("custom")
    // @Primary
    public MyFirstClass myThirdBean() {
        return new MyFirstClass("Third Bean");
    }
}

package br.com.crossmade.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaApplication {
    public static void main(String[] args) {
        var ctx = SpringApplication.run(JavaApplication.class, args);

        var myFirstBean = ctx.getBean(MyFirstService.class);

        System.err.println(myFirstBean.tellAStory());
        System.err.println(myFirstBean.getJavaVersion());

    }
}

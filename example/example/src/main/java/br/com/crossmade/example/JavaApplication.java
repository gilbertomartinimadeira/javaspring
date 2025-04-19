package br.com.crossmade.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaApplication {
    public static void main(String[] args) {
        var ctx = SpringApplication.run(JavaApplication.class, args);

        var myFirstBean = ctx.getBean(MyFirstService.class);

        System.out.println(myFirstBean.tellAStory());

        System.out.println(myFirstBean.getCustomProperty());
        System.out.println(myFirstBean.getCustomPropertyFromAnotherFile());
        System.out.println(myFirstBean.getCustomIntProperty());

    }
}

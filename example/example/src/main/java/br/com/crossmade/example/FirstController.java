package br.com.crossmade.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from my first controller";
    }

    @GetMapping("/hello-2")
    public String sayHelloAgain() {
        return "Second Greeting from my first controller";
    }

    @PostMapping("/post")
    public String createMessage(@RequestBody String message) {
        return "message received: " + message;
    }

    @PostMapping("/post-order")
    public String createOrder(@RequestBody Order order) {
        return "Order received: " + order;
    }

    @PostMapping("/post-order-record")
    public String createOrderRecord(@RequestBody OrderRecord orderRecord) {
        return "Order Record received: " + orderRecord.toString();
    }
}

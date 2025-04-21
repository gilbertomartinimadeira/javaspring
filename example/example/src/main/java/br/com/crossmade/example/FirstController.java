package br.com.crossmade.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController

public class FirstController {
    private final StudentRepository _repository;

    public FirstController(StudentRepository repository) {
        _repository = repository;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from my first controller";
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return _repository.save(student);

    }
}

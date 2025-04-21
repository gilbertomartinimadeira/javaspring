package br.com.crossmade.example;

import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/students/{id}")
    public Optional<Student> findStudentById(@PathVariable Integer id) {
        return _repository.findById(id);
    }

}

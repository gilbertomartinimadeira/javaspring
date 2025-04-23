package br.com.crossmade.example;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

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
    public Student findStudentById(@PathVariable Integer id) {
        return _repository.findById(id).orElse(new Student());
    }

    @GetMapping("/students")
    public List<Student> listAllStudents() {
        return _repository.findAll();
    }

    @GetMapping("/students/search/{student-name}")
    public List<Student> findStudentsByName(
            @PathVariable("student-name") String name) {
        return _repository.findAllByFirstnameContaining(name);
    }

    @DeleteMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(@PathVariable("student-id") Integer id) {
        _repository.deleteById(id);
    }

}

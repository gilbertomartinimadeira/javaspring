package br.com.crossmade.example;

import org.hibernate.annotations.Collate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private Integer id;
    @Column(name = "first_name", length = 20)
    private String firstname;
    @Column(name = "last_name", length = 30)
    private String lastname;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "age", updatable = false)
    private int age;

    public Student(String firstname, String lastname, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }

    public Student() {

    }

}

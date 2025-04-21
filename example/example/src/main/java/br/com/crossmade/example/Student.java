package br.com.crossmade.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {

    @Id
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
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

package in.ac.charusat.studentmgmtsystem.controller;
package in.ac.charusat.studentmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private Integer id;
    private String name;
    private String address;
    public Student(Integer id, String name, String address) {
        this.address = address;
    }

    public Student() {

    }

    public Integer getId() {
        return id;
    }
// Объект Работники, которые участвовали в проверке
package com.myproject.cybersec;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    private String department;
    private String position;
    private String fio;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "act_id")
    private Act actE;

    public Act getActE() {
        return actE;
    }

    public void setActE(Act actE) {
        this.actE = actE;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}

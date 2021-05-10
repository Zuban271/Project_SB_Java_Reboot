// Обекты Приложения без нарушений к актам проверок
package com.myproject.cybersec;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name = "appendix_w_violation")
public class AppendixWithoutViolation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    private Date date;
    private String fio;
    private String department;
    private String address;
    private Integer workplacecount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getWorkplacecount() {
        return workplacecount;
    }

    public void setWorkplacecount(Integer workplacecount) {
        this.workplacecount = workplacecount;
    }
}

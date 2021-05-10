// Объект ТМ-идентификаторов (журнал учета выдачи ТМ-идентификаторов)
package com.myproject.cybersec;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "tm_identifire")
public class TM_identifire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    private  Date date;
    private String number_TM;
    private String responsible;
    private Boolean given;
    private String toWhom;
    private String zno;

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

    public String getNumber_TM() {
        return number_TM;
    }

    public void setNumber_TM(String number_TM) {
        this.number_TM = number_TM;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public Boolean getGiven() {
        return given;
    }

    public void setGiven(Boolean given) {
        this.given = given;
    }

    public String getToWhom() {
        return toWhom;
    }

    public void setToWhom(String toWhom) {
        this.toWhom = toWhom;
    }

    public String getZno() {
        return zno;
    }

    public void setZno(String zno) {
        this.zno = zno;
    }
}

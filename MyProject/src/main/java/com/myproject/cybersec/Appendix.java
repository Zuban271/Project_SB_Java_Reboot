// Обекты Приложения с нарушениями к актам проверок
package com.myproject.cybersec;

import javax.persistence.*;
import java.io.File;
import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name = "appendix")
public class Appendix {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    private String workplace;
    private String fio_pos_dep;
    private Date time_fix;
    private Blob foto;
    private String explanation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getFio_pos_dep() {
        return fio_pos_dep;
    }

    public void setFio_pos_dep(String fio_pos_dep) {
        this.fio_pos_dep = fio_pos_dep;
    }

    public Date getTime_fix() {
        return time_fix;
    }

    public void setTime_fix(Date time_fix) {
        this.time_fix = time_fix;
    }

    public Blob getFoto(){
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}

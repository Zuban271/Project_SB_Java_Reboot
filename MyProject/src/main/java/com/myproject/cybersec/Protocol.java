// Объект Протокол проверки
package com.myproject.cybersec;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "protocol")
public class Protocol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date date;
    private String  workplace;
    private String  office;
    private String  authority;
    private String  fio;
    private String  position;
    private Boolean confidental;
    private Boolean notblock;
    private Boolean integrity;
    private Boolean unregistered;
    private Boolean device;
    private Boolean identificator;
    private Boolean password;
    private Boolean etc;
    private String record;

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

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boolean getConfidental() {
        return confidental;
    }

    public void setConfidental(Boolean confidental) {
        this.confidental = confidental;
    }

    public Boolean getNotblock() {
        return notblock;
    }

    public void setNotblock(Boolean notblock) {
        this.notblock = notblock;
    }

    public Boolean getIntegrity() {
        return integrity;
    }

    public void setIntegrity(Boolean integrity) {
        this.integrity = integrity;
    }

    public Boolean getUnregistered() {
        return unregistered;
    }

    public void setUnregistered(Boolean unregistered) {
        this.unregistered = unregistered;
    }

    public Boolean getDevice() {
        return device;
    }

    public void setDevice(Boolean device) {
        this.device = device;
    }

    public Boolean getIdentificator() {
        return identificator;
    }

    public void setIdentificator(Boolean identificator) {
        this.identificator = identificator;
    }

    public Boolean getPassword() {
        return password;
    }

    public void setPassword(Boolean password) {
        this.password = password;
    }

    public Boolean getEtc() {
        return etc;
    }

    public void setEtc(Boolean etc) {
        this.etc = etc;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }
}

package com.company.web2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|name,phone")
@Table(name = "WEB2_CLIENT")
@Entity(name = "web2$Client")
public class Client extends StandardEntity {
    private static final long serialVersionUID = -175636504521767472L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "PHONE", nullable = false, unique = true, length = 20)
    protected String phone;

    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    protected String email;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
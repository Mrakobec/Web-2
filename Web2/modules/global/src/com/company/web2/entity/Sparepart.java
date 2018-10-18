package com.company.web2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|title")
@Table(name = "WEB2_SPAREPART")
@Entity(name = "web2$Sparepart")
public class Sparepart extends StandardEntity {
    private static final long serialVersionUID = 1579395282988680723L;

    @NotNull
    @Column(name = "TITLE", nullable = false, unique = true)
    protected String title;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "PRICE")
    protected BigDecimal price;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }


}
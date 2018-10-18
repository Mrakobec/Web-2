package com.company.web2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|description")
@Table(name = "WEB2_ORDER")
@Entity(name = "web2$Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = -1911961768967083829L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLIENT_ID")
    protected Client client;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MECHANIC_ID")
    protected Mechanic mechanic;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "HOURSSPENT")
    protected Integer hoursspent;

    @Column(name = "AMOUNT")
    protected BigDecimal amount;

    @JoinTable(name = "WEB2_ORDER_SPAREPART_LINK",
        joinColumns = @JoinColumn(name = "ORDER_ID"),
        inverseJoinColumns = @JoinColumn(name = "SPAREPART_ID"))
    @ManyToMany
    protected List<Sparepart> spareparts;

    @Column(name = "STATUS")
    protected Integer status;

    public void setStatus(OrderStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public OrderStatus getStatus() {
        return status == null ? null : OrderStatus.fromId(status);
    }


    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setHoursspent(Integer hoursspent) {
        this.hoursspent = hoursspent;
    }

    public Integer getHoursspent() {
        return hoursspent;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setSpareparts(List<Sparepart> spareparts) {
        this.spareparts = spareparts;
    }

    public List<Sparepart> getSpareparts() {
        return spareparts;
    }


}
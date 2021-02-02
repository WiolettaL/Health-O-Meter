package com.superdevs.HealthOMeter.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "biometrichistoricaldata")
public class BioMetricHistoricalData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "growth")
    private BigDecimal growth;

    @Column(name = "weight")
    private BigDecimal weight;

    @Column(name = "waist_circ")
    private BigDecimal waistCirc;

    @Column(name = "hip_circ")
    private BigDecimal hipCirc;

    @Column(name = "created")
    private LocalDateTime created;

    @ManyToOne
    @JoinColumn(name = "contact_id")
    @JsonBackReference
    private Contact contact;

    public BioMetricHistoricalData() {
    }

    public BioMetricHistoricalData(BigDecimal growth, BigDecimal weight, BigDecimal waistCirc,
                                   BigDecimal hipCirc, Contact contact) {
        this.growth = growth;
        this.weight = weight;
        this.waistCirc = waistCirc;
        this.hipCirc = hipCirc;
        this.created = LocalDateTime.now();
        this.contact = contact;
    }

    public long getId() {
        return id;
    }

    public BigDecimal getGrowth() {
        return growth;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public BigDecimal getWaistCirc() {
        return waistCirc;
    }

    public BigDecimal getHipCirc() {
        return hipCirc;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public Contact getContact() {
        return contact;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setGrowth(BigDecimal growth) {
        this.growth = growth;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public void setWaistCirc(BigDecimal waistCirc) {
        this.waistCirc = waistCirc;
    }

    public void setHipCirc(BigDecimal hipCirc) {
        this.hipCirc = hipCirc;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
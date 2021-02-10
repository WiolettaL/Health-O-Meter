package com.superdevs.HealthOMeter.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "updated")
    private LocalDateTime updated;

    @OneToOne(mappedBy = "contact", fetch = FetchType.EAGER)
    private User user;

    @OneToOne(mappedBy = "contact", fetch = FetchType.EAGER)
    private MedicalData medicalData;

    @OneToOne(mappedBy = "contact", fetch = FetchType.EAGER)
    private BioMetricData bioMetricData;

    @OneToOne(mappedBy = "contact", fetch = FetchType.EAGER)
    private BMIData bmiData;

    @OneToOne(mappedBy = "contact", fetch = FetchType.EAGER)
    private WHRData whrData;

    @OneToOne(mappedBy = "contact", fetch = FetchType.EAGER)
    private RFMData rfmData;

    @OneToMany(mappedBy = "contact", fetch = FetchType.EAGER)
    @JsonManagedReference
    private Set<BioMetricHistoricalData> bioMetricHistoricalData;

    @OneToMany(mappedBy = "contact", fetch = FetchType.EAGER)
    @JsonManagedReference
    private Set<HistoricalCalculatorsResults> historicalCalculatorsResults;

    @OneToMany(mappedBy = "contact", fetch = FetchType.EAGER)
    @JsonManagedReference
    private Set<HistoricalMedicalData> historicalMedicalData;

    public Contact() {
    }

    public Contact(String firstName, String lastName, Gender gender, String email, String country,
                   String city, User user, MedicalData medicalData, BioMetricData bioMetricData, BMIData bmiData, WHRData whrData,
                   RFMData rfmData, Set<BioMetricHistoricalData> bioMetricHistoricalData,
                   Set<HistoricalCalculatorsResults> historicalCalculatorsResults, Set<HistoricalMedicalData> historicalMedicalData) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.country = country;
        this.city = city;
        this.created = LocalDateTime.now();
        this.updated = LocalDateTime.now();
        this.user = user;
        this.medicalData = medicalData;
        this.bioMetricData = bioMetricData;
        this.bmiData = bmiData;
        this.whrData = whrData;
        this.rfmData = rfmData;
        this.bioMetricHistoricalData = bioMetricHistoricalData;
        this.historicalCalculatorsResults = historicalCalculatorsResults;
        this.historicalMedicalData = historicalMedicalData;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public User getUser() {
        return user;
    }

    public MedicalData getMedicalData() {
        return medicalData;
    }

    public BioMetricData getBioMetricData() {
        return bioMetricData;
    }

    public BMIData getBmiData() {
        return bmiData;
    }

    public WHRData getWhrData() {
        return whrData;
    }

    public RFMData getRfmData() {
        return rfmData;
    }

    public Set<BioMetricHistoricalData> getBioMetricHistoricalData() {
        return bioMetricHistoricalData;
    }

    public Set<HistoricalCalculatorsResults> getHistoricalCalculatorsResults() {
        return historicalCalculatorsResults;
    }

    public Set<HistoricalMedicalData> getHistoricalMedicalData() {
        return historicalMedicalData;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setMedicalData(MedicalData medicalData) {
        this.medicalData = medicalData;
    }

    public void setBioMetricData(BioMetricData bioMetricData) {
        this.bioMetricData = bioMetricData;
    }

    public void setBmiData(BMIData bmiData) {
        this.bmiData = bmiData;
    }

    public void setWhrData(WHRData whrData) {
        this.whrData = whrData;
    }

    public void setRfmData(RFMData rfmData) {
        this.rfmData = rfmData;
    }

    public void setBioMetricHistoricalData(Set<BioMetricHistoricalData> bioMetricHistoricalData) {
        this.bioMetricHistoricalData = bioMetricHistoricalData;
    }

    public void setHistoricalCalculatorsResults(Set<HistoricalCalculatorsResults> historicalCalculatorsResults) {
        this.historicalCalculatorsResults = historicalCalculatorsResults;
    }

    public void setHistoricalMedicalData(Set<HistoricalMedicalData> historicalMedicalData) {
        this.historicalMedicalData = historicalMedicalData;
    }
}
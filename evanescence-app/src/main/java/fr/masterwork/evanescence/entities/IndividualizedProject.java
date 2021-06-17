package fr.masterwork.evanescence.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import fr.masterwork.evanescence.customise.AbstractEntity;

@Transactional(propagation = Propagation.REQUIRED)
@Entity
@Table(name = "t_individualized_project", indexes = { @Index(name = "individualized_project_id_IDX", columnList = "id"),
	@Index(name = "individualized_project_personal_data_id_IDX", columnList = "personal_data_id") })
public class IndividualizedProject extends AbstractEntity {

    private static final long serialVersionUID = 6429049504934249241L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "t_establishments_individualizedProjects", joinColumns = @JoinColumn(name = "idIndividualizedProject"), inverseJoinColumns = @JoinColumn(name = "idEstablishment"))
    private Establishment establishment;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "individualized_project_personal_data_id_FK"), nullable = false)
    private PersonalData personalData;

    @Column(length = 55, nullable = false)
    private String whereComeFrom;

    @Column(length = 255, nullable = false)
    private String isYourDecision;

    @Column(length = 225, nullable = true)
    private String religion;

    @Column(length = 120, nullable = true)
    private String lastProfessionExercised;

    @Column(length = 4, nullable = true)
    private String isoResourceGroups;

    @Column(length = 1200, nullable = false)
    private String washHabit;

    @Column(length = 1200, nullable = false)
    private String clothingHabit;

    @Column(length = 1200, nullable = false)
    private String dietaryHabit;

    @Column(length = 1200, nullable = false)
    private String mobiltyHabit;

    @Column(length = 1200, nullable = false)
    private String breathingHabit;

    @Column(length = 1200, nullable = false)
    private String eliminationHabit;

    @Column(length = 1200, nullable = false)
    private String sleepHabit;

    @Column(length = 1200, nullable = false)
    private String communicationHabit;

    @Column(length = 1200, nullable = false)
    private String cultureAndHobbiesHabit;

    @Column(nullable = false)
    private LocalDate creationDate;

    @Column(length = 255, nullable = false)
    private String peoplePresent;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Establishment getEstablishment() {
	return establishment;
    }

    public void setEstablishments(Establishment establishment) {
	this.establishment = establishment;
    }

    public PersonalData getPersonalData() {
	return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
	this.personalData = personalData;
    }

    public String getWhereComeFrom() {
	return whereComeFrom;
    }

    public void setWhereComeFrom(String whereComeFrom) {
	this.whereComeFrom = whereComeFrom;
    }

    public String getIsYourDecision() {
	return isYourDecision;
    }

    public void setIsYourDecision(String isYourDecision) {
	this.isYourDecision = isYourDecision;
    }

    public String getReligion() {
	return religion;
    }

    public void setReligion(String religion) {
	this.religion = religion;
    }

    public String getLastProfessionExercised() {
	return lastProfessionExercised;
    }

    public void setLastProfessionExercised(String lastProfessionExercised) {
	this.lastProfessionExercised = lastProfessionExercised;
    }

    public String getIsoResourceGroups() {
	return isoResourceGroups;
    }

    public void setIsoResourceGroups(String isoResourceGroups) {
	this.isoResourceGroups = isoResourceGroups;
    }

    public String getWashHabit() {
	return washHabit;
    }

    public void setWashHabit(String washHabit) {
	this.washHabit = washHabit;
    }

    public String getClothingHabit() {
	return clothingHabit;
    }

    public void setClothingHabit(String clothingHabit) {
	this.clothingHabit = clothingHabit;
    }

    public String getDietaryHabit() {
	return dietaryHabit;
    }

    public void setDietaryHabit(String dietaryHabit) {
	this.dietaryHabit = dietaryHabit;
    }

    public String getMobiltyHabit() {
	return mobiltyHabit;
    }

    public void setMobiltyHabit(String mobiltyHabit) {
	this.mobiltyHabit = mobiltyHabit;
    }

    public String getBreathingHabit() {
	return breathingHabit;
    }

    public void setBreathingHabit(String breathingHabit) {
	this.breathingHabit = breathingHabit;
    }

    public String getEliminationHabit() {
	return eliminationHabit;
    }

    public void setEliminationHabit(String eliminationHabit) {
	this.eliminationHabit = eliminationHabit;
    }

    public String getSleepHabit() {
	return sleepHabit;
    }

    public void setSleepHabit(String sleepHabit) {
	this.sleepHabit = sleepHabit;
    }

    public String getCommunicationHabit() {
	return communicationHabit;
    }

    public void setCommunicationHabit(String communicationHabit) {
	this.communicationHabit = communicationHabit;
    }

    public String getCultureAndHobbiesHabit() {
	return cultureAndHobbiesHabit;
    }

    public void setCultureAndHobbiesHabit(String cultureAndHobbiesHabit) {
	this.cultureAndHobbiesHabit = cultureAndHobbiesHabit;
    }

    public LocalDate getCreationDate() {
	return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
	this.creationDate = creationDate;
    }

    public String getPeoplePresent() {
	return peoplePresent;
    }

    public void setPeoplePresent(String peoplePresent) {
	this.peoplePresent = peoplePresent;
    }

    @Override
    public String toString() {
	return "IndividualizedProject [id=" + id + ", establishments=" + establishment + ", personalData=" + personalData
		+ ", whereComeFrom=" + whereComeFrom + ", isYourDecision=" + isYourDecision + ", religion=" + religion
		+ ", lastProfessionExercised=" + lastProfessionExercised + ", isoResourceGroups=" + isoResourceGroups
		+ ", washHabit=" + washHabit + ", clothingHabit=" + clothingHabit + ", dietaryHabit=" + dietaryHabit
		+ ", mobiltyHabit=" + mobiltyHabit + ", breathingHabit=" + breathingHabit + ", eliminationHabit="
		+ eliminationHabit + ", sleepHabit=" + sleepHabit + ", communicationHabit=" + communicationHabit
		+ ", cultureAndHobbiesHabit=" + cultureAndHobbiesHabit + ", creationDate=" + creationDate
		+ ", peoplePresent=" + peoplePresent + "]";
    }

}

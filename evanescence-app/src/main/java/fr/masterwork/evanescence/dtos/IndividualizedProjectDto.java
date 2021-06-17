package fr.masterwork.evanescence.dtos;

import java.time.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class IndividualizedProjectDto {

    private Long id;

    @Valid
    private PersonalDataDto personalData;

    @NotBlank(message = "{PROJECT.INDIVIDUALIZED.NOT.BLANK.WHERE.COME.FROM}")
    @Size(min = 3, max = 55, message = "{PROJECT.INDIVIDUALIZED.SIZE.WHERE.COME.FROM}")
    private String whereComeFrom;

    @NotBlank(message = "{PROJECT.INDIVIDUALIZED.NOT.BLANK.IS.IT.YOUR.DECISION}")
    @Size(min = 1, max = 255, message = "{PROJECT.INDIVIDUALIZED.SIZE.IS.IT.YOUR.DECISION}")
    private String isItYourDecision;

    private String religion;

    @NotBlank(message = "{PROJECT.INDIVIDUALIZED.NOT.BLANK.PROFESSION.EXERCISED}")
    @Size(min = 2, max = 120, message = "{PROJECT.INDIVIDUALIZED.SIZE.IS.IT.YOUR.DECISION.EXERCISED}")
    private String lastProfessionExercised;

    @NotBlank(message = "{PROJECT.INDIVIDUALIZED.NOT.BLANK.ISO.RESOURCE.GROUP}")
    @Size(min = 4, max = 4, message = "{PROJECT.INDIVIDUALIZED.SIZE.ISO.RESOURCE.GROUP}")
    private String isoResourceGroups;

    @NotBlank(message = "{PROJECT.INDIVIDUALIZED.NOT.BLANK.HABIT}")
    @Size(min = 2, max = 1200, message = "{PROJECT.INDIVIDUALIZED.SIZE.HABIT}")
    private String washHabit;

    @NotBlank(message = "{PROJECT.INDIVIDUALIZED.NOT.BLANK.HABIT}")
    @Size(min = 2, max = 1200, message = "{PROJECT.INDIVIDUALIZED.SIZE.HABIT}")
    private String clothingHabit;

    @NotBlank(message = "{PROJECT.INDIVIDUALIZED.NOT.BLANK.HABIT}")
    @Size(min = 2, max = 1200, message = "{PROJECT.INDIVIDUALIZED.SIZE.HABIT}")
    private String dietaryHabit;

    @NotBlank(message = "{PROJECT.INDIVIDUALIZED.NOT.BLANK.HABIT}")
    @Size(min = 2, max = 1200, message = "{PROJECT.INDIVIDUALIZED.SIZE.HABIT}")
    private String mobiltyHabit;

    @NotBlank(message = "{PROJECT.INDIVIDUALIZED.NOT.BLANK.HABIT}")
    @Size(min = 2, max = 1200, message = "{PROJECT.INDIVIDUALIZED.SIZE.HABIT}")
    private String breathingHabit;

    @NotBlank(message = "{PROJECT.INDIVIDUALIZED.NOT.BLANK.HABIT}")
    @Size(min = 2, max = 1200, message = "{PROJECT.INDIVIDUALIZED.SIZE.HABIT}")
    private String eliminationHabit;

    @NotBlank(message = "{PROJECT.INDIVIDUALIZED.NOT.BLANK.HABIT}")
    @Size(min = 2, max = 1200, message = "{PROJECT.INDIVIDUALIZED.SIZE.HABIT}")
    private String sleepHabit;

    @NotBlank(message = "{PROJECT.INDIVIDUALIZED.NOT.BLANK.HABIT}")
    @Size(min = 2, max = 1200, message = "{PROJECT.INDIVIDUALIZED.SIZE.HABIT}")
    private String communicationHabit;

    @NotBlank(message = "{PROJECT.INDIVIDUALIZED.NOT.BLANK.HABIT}")
    @Size(min = 2, max = 1200, message = "{PROJECT.INDIVIDUALIZED.SIZE.HABIT}")
    private String cultureAndHobbiesHabit;

    @NotBlank(message = "{PROJECT.INDIVIDUALIZED.NOT.BLANK.CREATION.DATE}")
    @DateTimeFormat
    private LocalDate creationDate;

    @NotBlank(message = "{PROJECT.INDIVIDUALIZED.NOT.BLANK.PEOPLE.PRESENT}")
    @Size(min = 10, max = 255, message = "{PROJECT.INDIVIDUALIZED.SIZE.PEOPLE.PRESENT}")
    private String peoplePresent;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public PersonalDataDto getPersonalData() {
	return personalData;
    }

    public void setPersonalData(PersonalDataDto personalData) {
	this.personalData = personalData;
    }

    public String getWhereComeFrom() {
	return whereComeFrom;
    }

    public void setWhereComeFrom(String whereComeFrom) {
	this.whereComeFrom = whereComeFrom;
    }

    public String getIsItYourDecision() {
	return isItYourDecision;
    }

    public void setIsItYourDecision(String isItYourDecision) {
	this.isItYourDecision = isItYourDecision;
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
	return "IndividualizedProjectDto [id=" + id + ", personalData=" + personalData + ", whereComeFrom="
		+ whereComeFrom + ", isItYourDecision=" + isItYourDecision + ", religion=" + religion
		+ ", lastProfessionExercised=" + lastProfessionExercised + ", isoResourceGroups=" + isoResourceGroups
		+ ", washHabit=" + washHabit + ", clothingHabit=" + clothingHabit + ", dietaryHabit=" + dietaryHabit
		+ ", mobiltyHabit=" + mobiltyHabit + ", breathingHabit=" + breathingHabit + ", eliminationHabit="
		+ eliminationHabit + ", sleepHabit=" + sleepHabit + ", communicationHabit=" + communicationHabit
		+ ", cultureAndHobbiesHabit=" + cultureAndHobbiesHabit + ", creationDate=" + creationDate
		+ ", peoplePresent=" + peoplePresent + "]";
    }

}

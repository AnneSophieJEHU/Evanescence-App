package fr.masterwork.evanescence.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class PersonalDataDto {

    @NotBlank(message = "{PERSONALDATA.NOT.BLANK.LASTNAME}")
    @Size(min = 1, max = 30, message = "{PERSONALDATA.SIZE.LASTNAME}")
    private String lastName;

    @NotBlank(message = "{PERSONALDATA.NOT.BLANK.FIRSTNAME}")
    @Size(min = 1, max = 40, message = "{PERSONALDATA.SIZE.FIRSTNAME}")
    private String firstName;

    @NotBlank(message = "{PERSONALDATA.NOT.BLANK.GENDER}")
    @Size(min = 1, max = 10, message = "{PERSONALDATA.SIZE.GENDER}")
    private String gender;

    @NotBlank(message = "{PERSONALDATA.NOT.BLANK.BIRTHDATE}")
    @Size(min = 6, max = 20, message = "{PERSONALDATA.SIZE.FIRSTNAME}")
    private String birthdate;

    private String birthplace;

    private String nativeLanguage;

    private String otherslanguagesSproken;

    @NotBlank(message = "{PERSONALDATA.NOT.BLANK.MARITAL.STATUS}")
    @Size(min = 3, max = 35, message = "{PERSONALDATA.SIZE.MARITAL.STATUS}")
    private String maritalStatus;

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getGender() {
	return gender;
    }

    public void setGender(String gender) {
	this.gender = gender;
    }

    public String getBirthdate() {
	return birthdate;
    }

    public void setBirthdate(String birthdate) {
	this.birthdate = birthdate;
    }

    public String getBirthplace() {
	return birthplace;
    }

    public void setBirthplace(String birthplace) {
	this.birthplace = birthplace;
    }

    public String getNativeLanguage() {
	return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
	this.nativeLanguage = nativeLanguage;
    }

    public String getOtherslanguagesSproken() {
	return otherslanguagesSproken;
    }

    public void setOtherslanguagesSproken(String otherslanguagesSproken) {
	this.otherslanguagesSproken = otherslanguagesSproken;
    }

    public String getMaritalStatus() {
	return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
	this.maritalStatus = maritalStatus;
    }

}

package fr.masterwork.evanescence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "t_personal_data",  indexes = {
		@Index(name = "personal_data_id_IDX", columnList = "id") })
public class PersonalData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    private String lastName;

    @Column(length = 40, nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String gender;
    
    @Column(length = 20,nullable = false)
    private String birthdate;

    @Column(length = 100, nullable = true)
    private String birthplace;

    @Column(length = 20, nullable = true)
    private String nativeLanguage;

    @Column(length = 70, nullable = true)
    private String otherslanguagesSproken;

    @Column(length = 35, nullable = false)
    private String maritalStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
	return "PersonalData [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", gender=" + gender
		+ ", birthdate=" + birthdate + ", birthplace=" + birthplace + ", nativeLanguage=" + nativeLanguage
		+ ", otherslanguagesSproken=" + otherslanguagesSproken + ", maritalStatus=" + maritalStatus + "]";
    }

  

}

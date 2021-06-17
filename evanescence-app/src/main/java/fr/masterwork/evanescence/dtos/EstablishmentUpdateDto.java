package fr.masterwork.evanescence.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import fr.masterwork.evanescence.validations.UniqueEmailAddress;
import fr.masterwork.evanescence.validations.UniqueSiretNumber;

public class EstablishmentUpdateDto {

    Long id;

    @NotBlank(message = "{ESTABLISHMENT.NOT.BLANK.BUSINESSNAME}")
    @Size(min = 2, max = 100, message = "{ESTABLISHMENT.SIZE.BUSINESSNAME}")
    private String businessName;

    @NotBlank(message = "{ESTABLISHMENT.NOT.BLANK.SIRETNUMBER}")
    @Size(min = 14, max = 14, message = "{ESTABLISHMENT.SIZE.SIRETNUMBER}")
    @UniqueSiretNumber(message = "{ESTABLISHMENT.UNIQUE.SIRETNUMBER}")
    private String siretNumber;

    private AddressDto addressEstablishment;

    @Email(regexp = "[a-z0-9._-]+@[a-z]+\\.[a-z]{2,}", message = "{ESTABLISHMENT.FORMAT.EMAIL.ADDRESS}")
    @NotBlank(message = "{ESTABLISHMENT.NOT.BLANK.EMAIL.ADDRESS}")
    @Size(min = 6, max = 320, message = "{ESTABLISHMENT.SIZE.EMAIL.ADDRESS}")
    @UniqueEmailAddress(message = "{ESTABLISHMENT.UNIQUE.EMAIL.ADDRESS}")
    private String emailAddress;

    @NotBlank(message = "{ESTABLISHMENT.NOT.BLANK.PHONE.NUMBER}")
    @Size(min = 10, max = 10, message = "{ESTABLISHMENT.SIZE.PHONE.NUMBER}")
    private String phoneNumber;

    private CustomerDto customerEstablishment;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getBusinessName() {
	return businessName;
    }

    public void setBusinessName(String businessName) {
	this.businessName = businessName;
    }

    public String getSiretNumber() {
	return siretNumber;
    }

    public void setSiretNumber(String siretNumber) {
	this.siretNumber = siretNumber;
    }

    public AddressDto getAddressEstablishment() {
	return addressEstablishment;
    }

    public void setAddressEstablishment(AddressDto addressEstablishment) {
	this.addressEstablishment = addressEstablishment;
    }

    public String getEmailAddress() {
	return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
	return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
    }

    public CustomerDto getCustomerEstablishment() {
	return customerEstablishment;
    }

    public void setCustomerEstablishment(CustomerDto customerEstablishment) {
	this.customerEstablishment = customerEstablishment;
    }

    @Override
    public String toString() {
	return "EstablishmentUpdateDto [id=" + id + ", businessName=" + businessName + ", siretNumber=" + siretNumber
		+ ", addressEstablishment=" + addressEstablishment + ", emailAddress=" + emailAddress + ", phoneNumber="
		+ phoneNumber + ", customerEstablishment=" + customerEstablishment + "]";
    }

}

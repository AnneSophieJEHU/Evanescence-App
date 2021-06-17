package fr.masterwork.evanescence.dtos;

import java.time.LocalDate;

import javax.validation.constraints.Size;

public class CustomerCreateDto {

    @Size(min = 13, max = 13, message = "{CUSTOMER.SIZE.CUSTOMER.IDENTIFIER}")
    private String customerIdentifier;

    private LocalDate startDateSubscription;

    private LocalDate endDateSubscription;

    public CustomerCreateDto() {
	this.customerIdentifier = this.generateCustomerIdentifier();
	this.startDateSubscription = LocalDate.now();
    }

    public CustomerCreateDto(LocalDate endDateSubscription) {
	super();
	this.customerIdentifier = this.generateCustomerIdentifier();
	this.startDateSubscription = this.createDateNow();
	this.endDateSubscription = endDateSubscription;
    }

    public String getCustomerIdentifier() {
	return customerIdentifier;
    }

    public LocalDate getStartDateSubscription() {
	return startDateSubscription;
    }

    private LocalDate createDateNow() {
	return LocalDate.now();
    }

    public LocalDate getEndDateSubscription() {
	return endDateSubscription;
    }

    public void setEndDateSubscription(LocalDate endDateSubscription) {
	this.endDateSubscription = endDateSubscription;
    }

    @Override
    public String toString() {
	return "CustomerDto [customerIdentifier=" + customerIdentifier + ", startDateSubscription="
		+ startDateSubscription + ", endDateSubscription=" + endDateSubscription + "]";
    }

    private String generateCustomerIdentifier() {

	String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz" + "0123456789";
	int identifierlength = 13;
	StringBuilder sb = new StringBuilder(identifierlength);

	for (int i = 0; i < identifierlength; i++) {
	    int index = (int) (AlphaNumericString.length() * Math.random());
	    sb.append(AlphaNumericString.charAt(index));
	}
	return sb.toString();
    }

}

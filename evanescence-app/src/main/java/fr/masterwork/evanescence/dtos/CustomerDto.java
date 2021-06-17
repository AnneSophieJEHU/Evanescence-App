package fr.masterwork.evanescence.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class CustomerDto {

    @NotBlank(message = "{CUSTOMER.NOT.BLANK.CUSTOMER.IDENTIFIER}")
    @Size(min = 13, max = 13, message = "{CUSTOMER.SIZE.CUSTOMER.IDENTIFIER}")
    private String customerIdentifier;

    @NotBlank(message = "{CUSTOMER.NOT.BLANK.START.DATE.SUBSCRIPTION}")
    @DateTimeFormat
    private LocalDate startDateSubscription;

    @DateTimeFormat
    private LocalDate endDateSubscription;

    public String getCustomerIdentifier() {
	return customerIdentifier;
    }

    public void setCustomerIdentifier(String customerIdentifier) {
	this.customerIdentifier = customerIdentifier;
    }

    public LocalDate getStartDateSubscription() {
	return startDateSubscription;
    }

    public void setStartDateSubscription(LocalDate startDateSubscription) {
	this.startDateSubscription = startDateSubscription;
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

}

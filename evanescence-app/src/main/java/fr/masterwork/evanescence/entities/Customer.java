package fr.masterwork.evanescence.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import fr.masterwork.evanescence.customise.AbstractEntity;

@Entity
@Table(name = "t_customer", uniqueConstraints = {
	@UniqueConstraint(columnNames = "customerIdentifier", name = "customer_customerIdentifier_UNIQUE") }, indexes = {
		@Index(name = "customer_id_IDX", columnList = "id") })
public class Customer extends AbstractEntity {

    private static final long serialVersionUID = 5102669859525717234L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 13, nullable = false)
    private String customerIdentifier;

    @Column(nullable = false)
    private LocalDate startDateSubscription;

    @Column(nullable = true)
    private LocalDate endDateSubscription;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

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
	return "Customer [id=" + id + ", customerIdentifier=" + customerIdentifier + ", startDateSubscription="
		+ startDateSubscription + ", endDateSubscription=" + endDateSubscription + "]";
    }

}

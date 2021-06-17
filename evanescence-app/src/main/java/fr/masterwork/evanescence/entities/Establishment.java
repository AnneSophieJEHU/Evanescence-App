package fr.masterwork.evanescence.entities;

import fr.masterwork.evanescence.customise.AbstractEntity;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Transactional(propagation = Propagation.REQUIRED)
@Entity
@Table(name = "t_establishment", uniqueConstraints = {
	@UniqueConstraint(columnNames = "emailAddress", name = "establishment_email_UNIQUE"),
	@UniqueConstraint(columnNames = "siretNumber", name = "establishment_siretNumber_UNIQUE") }, indexes = {
		@Index(name = "establishment_id_IDX", columnList = "id"),
		@Index(name = "establishment_address_id_IDX", columnList = "address_Establishment_id"),
		@Index(name = "establishment_customer_id_IDX", columnList = "customer_Establishment_id") })
public class Establishment extends AbstractEntity {

    private static final long serialVersionUID = 4920000366184461201L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String businessName;

    @Column(length = 14, nullable = false)
    private String siretNumber;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "establishment_address_id_FK"), nullable = false)
    private Address addressEstablishment;

    @Column(length = 320, nullable = false)
    private String emailAddress;

    @Column(length = 10, nullable = false)
    private String phoneNumber;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "establishment_customer_id_FK"), nullable = false)
    private Customer customerEstablishment;

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

    public Address getAddressEstablishment() {
	return addressEstablishment;
    }

    public void setAddressEstablishment(Address addressEstablishment) {
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

    public Customer getCustomerEstablishment() {
	return customerEstablishment;
    }

    public void setCustomerEstablishment(Customer customerEstablishment) {
	this.customerEstablishment = customerEstablishment;
    }

   /* public List<IndividualizedProject> getIndividualizedProjects() {
	return individualizedProjects;
    }*/

/*    public void setIndividualizedProjects(List<IndividualizedProject> individualizedProjects) {
	this.individualizedProjects = individualizedProjects;
    }*/

    @Override
    public String toString() {
	return "Establishment [id=" + id + ", businessName=" + businessName + ", siretNumber=" + siretNumber
		+ ", addressEstablishment=" + addressEstablishment + ", emailAddress=" + emailAddress + ", phoneNumber="
		+ phoneNumber + ", customerEstablishment=" + customerEstablishment + ", individualizedProjects="
		//+ individualizedProjects
            +
            "]";
    }

}

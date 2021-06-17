package fr.masterwork.evanescence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import fr.masterwork.evanescence.customise.AbstractEntity;

@Entity
@Table(name = "t_address", indexes = {
	@Index(name = "address_id_IDX", columnList = "id") })
public class Address extends AbstractEntity {

    private static final long serialVersionUID = 4903272057092518465L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 65, nullable = false)
    private String road;

    @Column(length = 80, nullable = true)
    private String additionalAddress;

    @Column(length = 5, nullable = false)
    private String zipCode;

    @Column(length = 100, nullable = false)
    private String cityName;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getAdditionalAddress() {
	return additionalAddress;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public void setAdditionalAddress(String additionalAddress) {
	this.additionalAddress = additionalAddress;
    }

    public String getZipCode() {
	return zipCode;
    }

    public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
    }

    public String getCityName() {
	return cityName;
    }

    public void setCityName(String cityName) {
	this.cityName = cityName;
    }

    @Override
    public String toString() {
	return "Address [id=" + id + ", road=" + road + ", additionalAddress=" + additionalAddress + ", zipCode="
		+ zipCode + ", cityName=" + cityName + "]";
    }

}

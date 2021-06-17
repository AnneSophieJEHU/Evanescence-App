package fr.masterwork.evanescence.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import fr.masterwork.evanescence.validations.NullOrEmpty;

public class AddressDto {

    @NotBlank(message = "{ADDRESS.NOT.BLANK.ROAD}")
    @Size(min = 5, max = 65, message = "{ADDRESS.SIZE.ROAD}")
    private String road;

    @NullOrEmpty(size = 50)
    private String additionalAddress;

    @NotBlank(message = "{ADDRESS.NOT.BLANK.ZIP.CODE}")
    @Size(min = 5, max = 5, message = "{ADDRESS.SIZE.ZIP.CODE}")
    private String zipCode;

    @NotBlank(message = "{ADDRESS.NOT.BLANK.CITY.NAME}")
    @Size(min = 2, max = 100, message = "{ADDRESS.SIZE.CITY.NAME}")
    private String cityName;

    public String getRoad() {
	return road;
    }

    public void setRoad(String road) {
	this.road = road;
    }

    public String getAdditionalAddress() {
	return additionalAddress;
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
	return "AddressDto [road=" + road + ", additionalAddress=" + additionalAddress + ", zipCode=" + zipCode
		+ ", cityName=" + cityName + "]";
    }

}

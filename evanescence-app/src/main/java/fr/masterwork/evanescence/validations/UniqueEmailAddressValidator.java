package fr.masterwork.evanescence.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


import fr.masterwork.evanescence.services.InformationsEstablishmentService;

public class UniqueEmailAddressValidator implements ConstraintValidator<UniqueEmailAddress, String> {
   
    private final InformationsEstablishmentService informationsEstablishmentService;
    
    public UniqueEmailAddressValidator(InformationsEstablishmentService informationsEstablishmentService) {
	this.informationsEstablishmentService = informationsEstablishmentService;
    }
    
    @Override
    public boolean isValid(String emailAddress, ConstraintValidatorContext context) {
	if (null == emailAddress || emailAddress.isEmpty()) {
	    return true;
	}
	return informationsEstablishmentService.emailAddressIsUnique(emailAddress);
    }
}

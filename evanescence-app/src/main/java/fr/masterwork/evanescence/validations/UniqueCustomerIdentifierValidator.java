package fr.masterwork.evanescence.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.masterwork.evanescence.services.InformationsCustomerIdentifierService;

public class UniqueCustomerIdentifierValidator implements ConstraintValidator<UniqueCustomerIdentifier, String> {

    private final InformationsCustomerIdentifierService informationsCustomerIdentifierService;
    
    public UniqueCustomerIdentifierValidator(InformationsCustomerIdentifierService informationsCustomerIdentifierService) {
	this.informationsCustomerIdentifierService = informationsCustomerIdentifierService;
    }


    @Override
    public boolean isValid(String customerIdentifier, ConstraintValidatorContext context) {
	if (null == customerIdentifier || customerIdentifier.isEmpty()) {
	    return true;
	}
	return informationsCustomerIdentifierService.customerIdentifierIsUnique(customerIdentifier);
    }

}

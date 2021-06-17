package fr.masterwork.evanescence.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


import fr.masterwork.evanescence.services.InformationsEstablishmentService;

public class UniqueSiretNumberValidator implements ConstraintValidator<UniqueSiretNumber, String> {
    
 private final InformationsEstablishmentService informationsEstablishmentService;

    public UniqueSiretNumberValidator(InformationsEstablishmentService informationsEstablishmentService) {
       this.informationsEstablishmentService = informationsEstablishmentService;
}



    @Override
    public boolean isValid(String siretNumber, ConstraintValidatorContext context) {
	if (null == siretNumber || siretNumber.isEmpty()) {
	    return true;
	}
	return informationsEstablishmentService.siretNumberIsUnique(siretNumber);
    }

}

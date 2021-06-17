package fr.masterwork.evanescence.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NullOrEmptyValidator implements ConstraintValidator<NullOrEmpty, String> {

    @Override
    public void initialize(NullOrEmpty field) {
    }

    @Override
    public boolean isValid(String field, ConstraintValidatorContext context) {
	if (field == null || field.isEmpty()) {
	    return true;
	}
	return field.length() == field.length();
    }

}

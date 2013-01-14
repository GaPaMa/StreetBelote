package webapp.validator;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import webapp.beans.Joueur;

@Service
public class ValidationInscription implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Joueur.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pseudo", null, "Champ obligatoire : veuillez saisir un pseudo");
	}

}

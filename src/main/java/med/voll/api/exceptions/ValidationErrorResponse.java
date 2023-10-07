package med.voll.api.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationErrorResponse {
	
	private List<ValidationError> errors;

    public ValidationErrorResponse() {
        this.errors = new ArrayList<>();
    }

    public void addError(ValidationError error) {
        this.errors.add(error);
    }

    public List<ValidationError> getErrors() {
        return this.errors;
    }
}
	 

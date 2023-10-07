package med.voll.api.exceptions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ValidationErrorHandler {

	  @ExceptionHandler(MethodArgumentNotValidException.class)
	    public ResponseEntity<ValidationErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {

	        ValidationErrorResponse errorResponse = new ValidationErrorResponse();
	        for (FieldError fieldError : ex.getBindingResult().getFieldErrors()) {
	            errorResponse.addError(new ValidationError(fieldError.getField(), fieldError.getRejectedValue(), fieldError.getDefaultMessage()));
	        }

	        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	    }
}

package med.voll.api.exceptions;

public class ValidationError {

	private String field;
    private Object rejectedValue;
    private String message;

    public ValidationError(String field, Object rejectedValue, String message) {
        this.field = field;
        this.rejectedValue = rejectedValue;
        this.message = message;
    }

    public String getField() {
        return this.field;
    }

    public Object getRejectedValue() {
        return this.rejectedValue;
    }

    public String getMessage() {
        return this.message;
    }
}

package store.exceptions;

public class ApiException extends RuntimeException{
    private final String message;
    private final int code;

    public ApiException(String message,  int code) {
        super(message);
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}

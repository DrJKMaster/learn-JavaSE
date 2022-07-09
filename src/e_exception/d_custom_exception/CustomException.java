package e_exception.d_custom_exception;

class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}

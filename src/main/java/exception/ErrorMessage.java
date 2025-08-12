package exception;

public enum ErrorMessage {

    INVALID_INTEGER_FORMAT("int 타입 정수가 아닌 값이 입력되었습니다."),
    INVALID_NEGATIVE_NUMBER("음수가 입력되었습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

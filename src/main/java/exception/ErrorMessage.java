package exception;

public enum ErrorMessage {

    INVALID_INTEGER_FORMAT("int 타입 정수가 아닌 값이 입력되었습니다."),
    INVALID_NEGATIVE_NUMBER("음수가 입력되었습니다."),
    INVALID_NAME_EMPTY("이름이 비어있습니다."),
    INVALID_NAME_LENGTH("이름이 5글자를 넘었습니다."),
    INVALID_PLAYER_NAMES_EMPTY("참여자가 존재하지 않습니다");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

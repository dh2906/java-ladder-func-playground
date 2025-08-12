package model;

import exception.CustomException;
import exception.ErrorMessage;

public class Player {

    private final String name;

    public Player(String name) {
        validate(name);

        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void validate(String name) {
        validateNameEmpty(name);
        validateNameLength(name);
    }

    private void validateNameEmpty(String name) {
        if (name == null || name.isBlank()) {
            throw new CustomException(ErrorMessage.INVALID_NAME_EMPTY);
        }
    }

    private void validateNameLength(String name) {
        if (name.length() > 5) {
            throw new CustomException(ErrorMessage.INVALID_NAME_LENGTH);
        }
    }
}

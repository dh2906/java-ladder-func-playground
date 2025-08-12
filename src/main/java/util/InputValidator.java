package util;

import exception.CustomException;
import exception.ErrorMessage;

public class InputValidator {

    public static void validateNotNegative(int value) {
        if (value < 0)
            throw new CustomException(ErrorMessage.INVALID_NEGATIVE_NUMBER);
    }
}

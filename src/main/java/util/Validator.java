package util;

import exception.CustomException;
import exception.ErrorMessage;

public class Validator {

    public static void validateNotNegative(int value) {
        if (value < 0)
            throw new CustomException(ErrorMessage.NEGATIVE_NUMBER);
    }
}

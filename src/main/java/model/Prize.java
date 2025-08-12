package model;

import exception.CustomException;
import exception.ErrorMessage;

public class Prize {

    private final String prize;

    public Prize(String prize) {
        validate(prize);

        this.prize = prize;
    }

    private void validate(String prize) {
        if (prize == null || prize.isBlank()) {
            throw new CustomException(ErrorMessage.PRIZE_EMPTY);
        }
    }

    public String getPrize() {
        return prize;
    }
}

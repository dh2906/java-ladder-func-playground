package model;

import util.InputValidator;

public class Height {

    private final int height;

    public Height(int height) {
        InputValidator.validateNotNegative(height);

        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}

package model;

import util.Validator;

public class Height {

    private final int height;

    public Height(int height) {
        Validator.validateNotNegative(height);

        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}

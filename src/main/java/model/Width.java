package model;

import util.Validator;

public class Width {

    private final int width;

    public Width(int width) {
        Validator.validateNotNegative(width);

        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}

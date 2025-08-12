package model;

import util.InputValidator;

public class Width {

    private final int width;

    public Width(int width) {
        InputValidator.validateNotNegative(width);

        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}

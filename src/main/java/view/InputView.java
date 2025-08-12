package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.CustomException;
import exception.ErrorMessage;
import model.Height;
import model.Width;

public class InputView {

    private final Scanner sc;

    public InputView(Scanner sc) {
        this.sc = sc;
    }

    public Width inputWidth() {
        System.out.println("사다리의 너비는 몇 개 인가요?");

        return new Width(inputValue());
    }

    public Height inputHeight() {
        System.out.println("사다리의 높이는 몇 개 인가요?");

        return new Height(inputValue());
    }

    private int inputValue() {
        try {
            return sc.nextInt();
        } catch (InputMismatchException ex) {
            throw new CustomException(ErrorMessage.INVALID_INTEGER_FORMAT);
        }
    }
}

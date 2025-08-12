package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.CustomException;
import exception.ErrorMessage;

public class InputView {

    private final Scanner sc;

    public InputView(Scanner sc) {
        this.sc = sc;
    }

    public int inputWidth() {
        System.out.println("사다리의 너비는 몇 개 인가요?");

        return inputValue();
    }

    public int inputHeight() {
        System.out.println("사다리의 높이는 몇 개 인가요?");

        return inputValue();
    }

    private int inputValue() {
        try {
            return sc.nextInt();
        } catch (InputMismatchException ex) {
            throw new CustomException(ErrorMessage.INVALID_INTEGER_FORMAT);
        }
    }

    public String inputPlayerNames() {
        System.out.println("참여할 사람의 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요.");

        return sc.nextLine();
    }
}

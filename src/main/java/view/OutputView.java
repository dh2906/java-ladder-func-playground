package view;

import model.Ladder;

public class OutputView {

    public void printExecuteResult(Ladder ladder) {
        System.out.println("실행결과 \n");
        ladder.print();
    }
}

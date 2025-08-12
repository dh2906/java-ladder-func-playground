package view;

import model.Ladder;
import model.Line;

public class OutputView {

    public void printExecuteResult(Ladder ladder) {
        System.out.println("실행결과 \n");
        ladder.print();

        for (int i = 0; i < ladder.getLines().size(); i++) {
            System.out.printf("%d -> %d \n", i, ladder.move(i));
        }
    }
}

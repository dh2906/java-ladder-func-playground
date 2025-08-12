package controller;

import java.util.Random;

import model.Ladder;
import model.LadderGenerator;
import view.OutputView;

public class LadderGameController {

    private final LadderGenerator ladderGenerator;
    private final OutputView outputView;

    public LadderGameController() {
        this.ladderGenerator = new LadderGenerator(new Random());
        this.outputView = new OutputView();
    }

    public void run() {
        Ladder ladder = ladderGenerator.generate(4, 4);

        outputView.printExecuteResult(ladder);
    }
}

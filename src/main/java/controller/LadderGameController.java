package controller;

import java.util.Random;
import java.util.Scanner;

import model.Height;
import model.Ladder;
import model.LadderGenerator;
import model.Width;
import view.InputView;
import view.OutputView;

public class LadderGameController {

    private final LadderGenerator ladderGenerator;
    private final OutputView outputView;
    private final InputView inputView;

    public LadderGameController() {
        this.ladderGenerator = new LadderGenerator(new Random());
        this.outputView = new OutputView();
        this.inputView = new InputView(new Scanner(System.in));
    }

    public void run() {
        Width width = new Width(inputView.inputWidth());
        Height height = new Height(inputView.inputHeight());
        Ladder ladder = ladderGenerator.generate(height, width);

        outputView.printExecuteResult(ladder);
    }
}

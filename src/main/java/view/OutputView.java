package view;

import model.Ladder;
import model.Player;
import model.Players;
import model.Prize;
import model.Prizes;

public class OutputView {

    public void printExecuteResult(Ladder ladder, Players players, Prizes prizes) {
        System.out.println("실행결과 \n");

        for (Player player : players.getPlayers()) {
            System.out.printf("%-6s", player.getName());
        }

        System.out.println();

        ladder.print();

        for (Prize prize : prizes.getPrizes()) {
            System.out.printf("%-6s ", prize.getPrize());
        }

        System.out.println();

        for (int i = 0; i < ladder.getLines().size() - 1; i++) {
            System.out.printf("%d -> %d \n", i, ladder.move(i));
        }
    }
}

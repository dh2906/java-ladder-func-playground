package view;

import model.Ladder;
import model.Player;
import model.Players;
import model.Prize;
import model.Prizes;

public class OutputView {

    public void printExecuteResult(Ladder ladder, Players players, Prizes prizes) {
        System.out.println("\n사다리결과\n");

        for (Player player : players.getPlayers()) {
            System.out.printf("%-6s", player.getName());
        }

        System.out.println();

        ladder.print();

        for (Prize prize : prizes.getPrizes()) {
            System.out.printf("%-4s ", prize.getPrize());
        }

        System.out.println("\n");
    }

    public void printAllPlayerResult(Ladder ladder, Players players, Prizes prizes) {
        System.out.println();

        for (int i = 0; i < players.size(); i++) {
            String playerName = players.getPlayers().get(i).getName();
            int position = ladder.move(i);
            String prize = prizes.getPrizes().get(position).getPrize();

            System.out.printf("%s : %s\n", playerName, prize);
        }
    }

    public void printSinglePlayerResult(Ladder ladder, Players players, Prizes prizes, String playerName) {
        System.out.println();

        int index = players.indexOf(playerName);
        int position = ladder.move(index);
        String prize = prizes.getPrizes().get(position).getPrize();

        System.out.println("실행결과");
        System.out.println(prize);
    }
}

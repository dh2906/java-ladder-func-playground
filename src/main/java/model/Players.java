package model;

import java.util.ArrayList;
import java.util.List;

import exception.CustomException;
import exception.ErrorMessage;

public class Players {

    private final List<Player> players;

    public Players(List<String> playerNames) {
        validate(playerNames);

        this.players = init(playerNames);
    }

    public void validate(List<String> playerNames) {
        if (playerNames == null || playerNames.isEmpty()) {
            throw new CustomException(ErrorMessage.PLAYER_NAMES_EMPTY);
        }
    }

    private List<Player> init(List<String> playerNames) {
        List<Player> result = new ArrayList<>();

        for (String name : playerNames) {
            result.add(new Player(name));
        }

        return result;
    }

    public int size() {
        return players.size();
    }
}

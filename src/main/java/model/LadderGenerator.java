package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LadderGenerator {

    private final Random random;

    public LadderGenerator(Random random) {
        this.random = random;
    }

    public Ladder generate(int height, int width) {
        List<Line> lines = new ArrayList<>();

        for (int i = 0; i < height; i++) {
            lines.add(new Line(generateConnections(width - 1)));
        }

        return new Ladder(height, lines);
    }

    private List<Boolean> generateConnections(int size) {
        List<Boolean> connections = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (i > 0 && connections.get(i - 1)) {
                connections.add(false);
            } else {
                connections.add(random.nextBoolean());
            }
        }

        return connections;
    }
}

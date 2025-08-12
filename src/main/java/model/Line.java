package model;

import java.util.List;

public class Line {

    private final List<Boolean> connections;

    public Line(List<Boolean> connections) {
        this.connections = connections;
    }

    public void print() {
        for (boolean connection : connections) {
            System.out.print("|");

            if (connection) {
                System.out.print("-----");
            } else {
                System.out.print("     ");
            }
        }

        System.out.println("|");
    }

    public int move(int index) {
        if (index < connections.size() && connections.get(index)) {
            return index + 1;
        } else if (index > 0 && connections.get(index - 1)) {
            return index - 1;
        }

        return index;
    }

    public List<Boolean> getConnections() {
        return connections;
    }
}

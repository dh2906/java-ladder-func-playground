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
}

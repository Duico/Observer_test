package server;

import server.controller.Controller;
import server.model.Game;

public class Main {

    public static void main(String[] args) {
        Controller c = new Controller();
        Game g = new Game(c);
        g.update(0,2);
    }
}

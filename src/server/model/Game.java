package server.model;

import server.controller.Controller;

public class Game {
    Turn turn;
    public Game(Controller controller){
        this.turn = new Turn();

        turn.addEventListener(controller);

    }

    public void update(int x, int y){
        turn.updatePosition(x,y);
    }

}

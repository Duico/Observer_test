package server.model;

import server.controller.Controller;

public class Game {
    Turn turn;
    public Game(Controller controller){
        this.turn = new Turn();

        turn.updatePosition(2 ,3);
        turn.addEventListener(controller);
    }

    void update(int x, int y){
        turn.updatePosition(x,y);
    }

}

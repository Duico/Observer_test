package server.model;

import server.event.SantoriniObservable;
import server.event.PositionUpdateEvent;

import java.util.EventListener;

public class Turn extends SantoriniObservable {
    Integer[][] grid = new Integer[3][3];
    int currPosX = 0;
    int currPosY = 0;


    public Turn() {

    }

    void updatePosition(int newPosX, int newPosY) {
        grid[currPosX][currPosY] = 0;
        grid[newPosX][newPosY] = 1;
        currPosX = newPosX;
        currPosY = newPosY;
        //emit event UpdatedPosition (newX newY)
        this.fireMyEvent(new PositionUpdateEvent(grid, "Message"));
    }


}
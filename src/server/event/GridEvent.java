package server.event;

import java.util.EventObject;

public class GridEvent extends EventObject {

    int startPositionX;
    int destPositionX;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public GridEvent(Object source, int startPositionX, int destPositionX) {
        super(source);
        this.startPositionX = startPositionX;
        this.destPositionX = destPositionX;
    }

    public int getStartPositionX() {
        return startPositionX;
    }

    public int getDestPositionX(){
        return  destPositionX;
    }
}


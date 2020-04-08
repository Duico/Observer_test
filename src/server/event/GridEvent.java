package server.event;

import java.util.EventObject;

public class GridEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public GridEvent(Object source) {
        super(source);
    }
}

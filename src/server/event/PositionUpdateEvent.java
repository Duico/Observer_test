package server.event;

import java.util.EventObject;

public class PositionUpdateEvent extends GridEvent {


    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public PositionUpdateEvent(Object source) {
        super(source);
    }
}

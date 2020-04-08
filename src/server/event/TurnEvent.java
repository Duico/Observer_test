package server.event;

import java.util.EventObject;

public class TurnEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public TurnEvent(Object source) {
        super(source);
    }
}

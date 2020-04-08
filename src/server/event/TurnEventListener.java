package server.event;

import java.util.EventListener;

public interface TurnEventListener extends SantoriniEventListener {
    void handleEvent(TurnEvent e);
}

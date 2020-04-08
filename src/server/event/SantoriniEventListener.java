package server.event;

import java.util.EventListener;
import java.util.EventObject;

public interface SantoriniEventListener extends EventListener {
    void handleEvent(EventObject e);
}

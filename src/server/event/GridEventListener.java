package server.event;

import java.util.EventListener;
import java.util.EventObject;

public interface GridEventListener extends SantoriniEventListener {
    void handleEvent(GridEvent e, int i, String s);
}

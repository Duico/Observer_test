package server.event;

import javax.swing.event.EventListenerList;
import java.util.EventObject;

public class SantoriniObservable {
    protected EventListenerList listenerList = new EventListenerList();

    public void addEventListener(SantoriniEventListener listener) {
        listenerList.add(SantoriniEventListener.class, listener);
    }
    public void removeEventListener(SantoriniEventListener listener) {
        listenerList.remove(SantoriniEventListener.class, listener);
    }
    public void fireMyEvent(GridEvent evt) {
        Object[] listeners = listenerList.getListenerList();
        for (int i = 0; i < listeners.length; i = i+2) {
            if (listeners[i] == SantoriniEventListener.class) {
                ((GridEventListener) listeners[i+1]).handleEvent(evt);
            }
        }
    }
    public void fireMyEvent(TurnEvent evt) {
        Object[] listeners = listenerList.getListenerList();
        for (int i = 0; i < listeners.length; i = i+2) {
            if (listeners[i] == SantoriniEventListener.class) {
                ((TurnEventListener) listeners[i+1]).handleEvent(evt);
            }
        }
    }
}
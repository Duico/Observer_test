package server.controller;

import server.event.GridEvent;
import server.event.GridEventListener;
import server.event.TurnEvent;
import server.event.TurnEventListener;

import java.util.EventObject;
// import java.util.EventListenerProxy;

public class Controller implements GridEventListener, TurnEventListener {

    @Override
    public void handleEvent(GridEvent e) {
        //manda alla view il grid event se necessario
        e.getSource();
        System.out.println("Controller is passing to view:" + e.getDestPositionX());
        System.out.println("Controller is passing to view:"+ e.getStartPositionX());
    }

    @Override
    public void handleEvent(TurnEvent e) {

    }

    @Override
    public void handleEvent(EventObject e) {

    }

}

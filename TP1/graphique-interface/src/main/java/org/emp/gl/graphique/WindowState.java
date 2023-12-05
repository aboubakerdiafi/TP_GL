package org.emp.gl.graphique;

public abstract class  WindowState {
    protected   WatchViewer context;

    public WindowState(WatchViewer context) {
        this.context = context;
    }
public abstract void changeState();
    public abstract void affichHour();


}


package org.emp.gl.graphique;

public abstract class  WindowState {
    protected   WatchViewer context;

    public WindowState(WatchViewer context) {
        this.context = context;
    }
public abstract void changeState();
    public abstract void display();
    public abstract void doMod();
    public abstract void doSet();
    public abstract void doSetting();


}


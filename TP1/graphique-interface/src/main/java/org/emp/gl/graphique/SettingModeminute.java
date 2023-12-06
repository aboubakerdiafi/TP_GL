package org.emp.gl.graphique;

public class SettingModeminute extends WindowState{
    int heur;
    int minute;
    public SettingModeminute(WatchViewer context) {
        super(context);
        context.timerMode.setDelay(450);
        context.setTextPosition1(String.valueOf( this.context.getHorloge().getHours()) );
        context.setTextPosition3("S");
        context.setTextPosition2(String.valueOf( this.context.getHorloge().getMinutes()));
        heur = context.getHorloge().getHours();
        minute=context.getHorloge().getMinutes();
    }

    @Override
    public void changeState() {

    }
    public void doSetting () {
        context.getHorloge().setHours(heur);
        context.getHorloge().setMinutes(minute);
        context.timerMode.setDelay(500);
        context.state=new HhMn(context);

        ;
    }

    @Override
    public void display() {
       // context.setTextPosition1(String.valueOf( heur) );
        context.setTextPosition3("S");
        context.setTextPosition2(context.etatClignotant? String.valueOf( minute):"   ");
    }

    @Override
    public void doMod() {

        this.context.getHorloge().setMinutes(minute);
        this.context.state=new SettingModehour(context);
    }

    @Override
    public void doSet() {
minute=(minute+1)%60;}
}

package org.emp.gl.graphique;

public class SettingModehour extends WindowState{
    int heur;
    int minute;
    public SettingModehour(WatchViewer context) {
        super(context);
        context.timerMode.setDelay(450);
        context.setTextPosition1(String.valueOf( this.context.getHorloge().getHours()) );
        context.setTextPosition3("S");
        context.setTextPosition2(String.valueOf( this.context.getHorloge().getMinutes()));
        heur=context.getHorloge().getHours();
        minute=context.getHorloge().getMinutes();


    }

    @Override
    public void changeState() {

    }

    @Override
    public void display() {
        context.setTextPosition1(context.etatClignotant ? String.valueOf( heur):"   " );
        context.setTextPosition3("S");
       // context.setTextPosition2(String.valueOf( minute));
    }
    public void doSetting () {
        context.getHorloge().setHours(heur);
        context.getHorloge().setMinutes(minute);
        context.timerMode.setDelay(500);
        context.state=new HhMn(context);

        ;
    }
    @Override
    public void doMod() {
        this.context.getHorloge().setHours(heur);
this.context.state=new SettingModeminute(context);
    }

    @Override
    public void doSet() {
        heur=(heur+1)%24;
    }
}

package org.emp.gl.graphique;

public class ChronometrePaused extends WindowState{
    public ChronometrePaused(WatchViewer context) {
        super(context);


    }
    @Override
    public void changeState() {

    }

    @Override
    public void display() {
        this.context.setTextPosition2(String.valueOf(context.getC().getSeconds()));

        this.context.setTextPosition4(String.valueOf(context.getC().getDixiemeDeSeconde()));

    }
    public void doSetting () {
        context.state=new SettingModehour(context);

        ;
    }
    @Override
    public void doMod() {
 this.context.getC().reset();


    }

    @Override
    public void doSet() {

        this.context.getC().setPaussed(false);

        this.context.state=new ChronometrePlay(context);
//System.out.println(this.context.getC().getEnableSecond());
    }
}

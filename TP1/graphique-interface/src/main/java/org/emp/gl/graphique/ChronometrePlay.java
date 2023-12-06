package org.emp.gl.graphique;

public class ChronometrePlay extends  WindowState{
    public ChronometrePlay(WatchViewer context) {
        super(context);
        this.context.setTextPosition2(String.valueOf(this.context.getC().getSeconds()));
        this.context.setTextPosition4(String.valueOf(this.context.getC().getDixiemeDeSeconde()));
      //System.out.println(String.valueOf(this.context.getC().getEnableDixiemSecond()));
        this.context.setTextPosition1("");
        this.context.setTextPosition3("C");
        this.context.setTextSeparator(" ");
        this.context.setTextSeparator2(":");
        context.timerMode.setDelay(10);
       context.timerMode.restart();

    }
    @Override
    public void changeState() {


    }
    public void doSetting () {
        context.state=new SettingModehour(context);

        ;
    }
    @Override
    public void display() {

        this.context.setTextPosition2(String.valueOf(context.getC().getSeconds()));

        this.context.setTextPosition4(String.valueOf(context.getC().getDixiemeDeSeconde()));





    }

    @Override
    public void doMod() {
        this.context.getC().setPaussed(true);
        context.timerMode.setDelay(500);

        this.context.state=new HhMn(context);
    }

    @Override
    public void doSet() {
       this.context.getC().setPaussed(true);
//System.out.println(this.context.getC().getEnableDixiemSecond()+" "+ this.context.getC().getSeconds());
        this.context.state=new ChronometrePaused(this.context);

    }
}

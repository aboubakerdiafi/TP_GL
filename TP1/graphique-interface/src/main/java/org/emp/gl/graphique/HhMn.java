package org.emp.gl.graphique;

class HhMn extends WindowState{
    public HhMn(WatchViewer context) {
        super(context);
    }

    @Override
    public void changeState() {
       this.context.state=new HhMnSs(this.context);
    }

    @Override
    public void display() {
        this.context.setTextPosition1(String.valueOf(context.getHorloge().getHours()));
        this.context.setTextPosition2(String.valueOf(context.getHorloge().getMinutes()));
        this.context.setTextPosition3("Hh:Mm");
        this.context.setTextSeparator(this.context.clignotent());
        this.context.setTextSeparator2("");
        this.context.setTextPosition4("");

    }
    @Override
    public void doSetting () {
        context.state=new SettingModehour(context);

       ;
    }

    @Override
    public void doMod() {
        this.context.getC().reset();
        this.context.getC().setPaussed(false);
        this.context.state=new ChronometrePlay(this.context);
    }

    @Override
    public void doSet() {
        this.context.state=new HhMnSs(this.context);
    }
}
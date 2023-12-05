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
    public void affichHour() {
        this.context.setTextPosition1(String.valueOf(context.getHorloge().getHours()));
        this.context.setTextPosition2(String.valueOf(context.getHorloge().getMinutes()));
        this.context.setTextPosition3("Hh:Mm");
        this.context.setTextSeparator(this.context.clignotent());
        this.context.setTextSeparator2("");
        this.context.setTextPosition4("");

    }
}
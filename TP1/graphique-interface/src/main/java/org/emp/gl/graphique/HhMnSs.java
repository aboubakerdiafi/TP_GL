package org.emp.gl.graphique;

class HhMnSs extends WindowState{

    public HhMnSs(WatchViewer context) {
        super(context);
    }
    public void changeState() {
        this.context.state=new HhMn(this.context);
    }

    @Override
    public void affichHour() {

            this.context.setTextPosition1(String.valueOf(context.getHorloge().getHours()));
            this.context.setTextPosition2(String.valueOf(context.getHorloge().getMinutes()));
            this.context.setTextPosition3("_:Ss");
            this.context.setTextPosition4(String.valueOf(context.getHorloge().getSeconds()));
            this.context.setTextSeparator(this.context.clignotent());
            this.context.setTextSeparator2(this.context.clignotent());





    }
}
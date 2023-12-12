package org.emp.gl.clients;



import org.emp.gl.lookup_module.Lookup;
import org.emp.gl.timer.service.TimerChangeListener;
import org.emp.gl.timer.service.TimerService ;

import java.beans.PropertyChangeEvent;


public class Chronometre implements TimerChangeListener {
    String name ;
    TimerService timerService ;
    int seconds ;
    int minutes ;
    int enableSecond=0;
    int enableDixiemSecond=0;

    int DixiemeDeSeconde;
    int hours ;
    boolean isPaussed=false;

    public boolean isPaussed() {
        return isPaussed;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setPaussed(boolean paussed) {
        isPaussed = paussed;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setDixiemeDeSeconde(int dixiemeDeSeconde) {
        DixiemeDeSeconde = dixiemeDeSeconde;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnableSecond(int enableSecond) {
        this.enableSecond = enableSecond;
    }

    public void setEnableDixiemSecond(int enableDixiemSecond) {
        this.enableDixiemSecond = enableDixiemSecond;
    }

    public int getEnableSecond() {
        return enableSecond;
    }

    public int getEnableDixiemSecond() {
        return enableDixiemSecond;
    }

    public int getDixiemeDeSeconde() {
        return DixiemeDeSeconde;
    }

    public Chronometre (String name ) {
        this . name = name ;
        timerService = Lookup. getInstance () . getService ( TimerService . class );
        if ( timerService != null ) {
            seconds = 0;
            DixiemeDeSeconde = 0;
            timerService . addTimeChangeListener ( this );
        }

    }
    public void afficherHeure () {
        if ( timerService != null )
            System . out . println ( name + " affiche " + timerService . getHeures () +":"+ timerService . getMinutes () +":"+ timerService .
                    getSecondes () ) ;
    }
    @Override
    public void propertyChange ( String prop , Object oldValue , Object newValue ) {
        if ( TimerChangeListener .DIXEME_DE_SECONDE_PROP . equals ( prop )){
            //secondElapsed () ;
            if(!isPaussed)
                incrementDixiemeSecond();
        }
//        if ( TimerChangeListener .SECONDE_PROP . equals ( prop )){
//            secondElapsed () ;
//
//        }
    }
    public void dixiemmesecond(){
        incrementDixiemeSecond();


    }
    void secondElapsed () {
        seconds =( seconds +1) %60 ;
        if ( seconds == 0) {
            minutes =( minutes +1) %60 ;
            if ( minutes ==0)
                hours =( hours +1) %24 ;
        }

    }


    public void incrementSecond () {
        seconds = ( seconds +1) %60 ;
    }
    public  void incrementDixiemeSecond () {
        DixiemeDeSeconde=(DixiemeDeSeconde+1)%10;
        if(DixiemeDeSeconde==0){
            incrementSecond();
        }

    }
    public void incrementMinutes () {
        minutes = ( minutes +1) %60 ;
    }
    public void incrementHours () {
        hours = ( hours +1) %24 ;
    }
    public int getHours () {
        return hours ;
    }
    //public int getMinutes () {
    //    return minutes ;
    //}
    public int getSeconds () {
        return seconds ;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }
    public void reset(){
        this.DixiemeDeSeconde = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;
    }
}


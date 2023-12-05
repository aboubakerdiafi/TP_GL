package org.emp.gl.clients ; 


import org.emp.gl.lookup_module.Lookup;

import org.emp.gl.timer.service.TimerChangeListener;
import org.emp.gl.timer.service.TimerService ;

import java.beans.PropertyChangeEvent;


public class Horloge implements TimerChangeListener {
    String name ;
    TimerService timerService ;
    int seconds ;
    int minutes ;
    int hours ;
    public Horloge ( String name ) {
        this . name = name ;
        timerService = Lookup . getInstance () . getService ( TimerService . class );
        if ( timerService != null ) {
            seconds = timerService . getSecondes () ;
            minutes = timerService . getMinutes () ;
            hours = timerService . getHeures () ;
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
        if ( TimerChangeListener . SECONDE_PROP . equals ( prop )){
            secondElapsed () ;
        }
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
    public void incrementMinutes () {
        minutes = ( minutes +1) %60 ;
    }
    public void incrementHours () {
        hours = ( hours +1) %24 ;
    }
    public int getHours () {
        return hours ;
    }
    public int getMinutes () {
        return minutes ;
    }
    public int getSeconds () {
        return seconds ;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }
}

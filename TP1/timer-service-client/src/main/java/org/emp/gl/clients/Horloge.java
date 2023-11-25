package org.emp.gl.clients ; 

import org.emp.gl.GUI.GUI;
import org.emp.gl.timer.service.TimerChangeListener;
import org.emp.gl.timer.service.TimerService ;

import java.beans.PropertyChangeEvent;


public class Horloge implements TimerChangeListener {

    String name;
    GUI window;
    TimerService timerService ; 


    public Horloge (String name, TimerService timerService) {
        this.window = new GUI();
        this.name = name ; 
        this.timerService = timerService ;
        this.timerService.addTimeChangeListener(this);

        System.out.println ("Horloge "+name+" initialized!") ;


    }

    public void afficherHeure () {
        if (timerService != null)
            System.out.println (name + " affiche " + timerService.getHeures() +":"+timerService.getMinutes()+":"+timerService.getSecondes()) ;
    }


//    public void propertyChange(String prop, Object oldValue, Object newValue) {
//        this.afficherHeure();
//    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.window.run(this.getHeures());

    }
    public String getHeures() {

        return  timerService.getHeures() +":"+timerService.getMinutes()+":"+timerService.getSecondes() ;}

    @Override
    public void propertyChange(String prop, Object oldValue, Object newValue) {

        this.window.run(this.getHeures());

    }
}

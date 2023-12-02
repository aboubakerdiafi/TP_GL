package org.emp.gl.clients;

import org.emp.gl.timer.service.TimerChangeListener;
import org.emp.gl.timer.service.TimerService;

import java.beans.PropertyChangeEvent;

public class CompteARebours implements TimerChangeListener {
    TimerService timerService ;
    String name;
    int compt;
   public CompteARebours(String name,int comptInitiale, TimerService timerService){
  this.compt=comptInitiale;
  this.name=name;
        this.timerService=timerService;
        this.timerService.addTimeChangeListener(this);
    }
    public void affichercompt(){
        System.out.println(name+" "+compt);

    }

    @Override
    public void propertyChange(String prop, Object oldValue, Object newValue) {
        if(prop.equals(SECONDE_PROP)){
            if(compt>0)
            {
            if (compt!=0) {

                affichercompt();
                compt--;
            }
            else
            { this.timerService.removeTimeChangeListener(this);

            }

            }
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
       String prop =evt.getPropertyName();
       if(prop.equals(SECONDE_PROP)){
            if(compt>0)
            {
                if (compt!=0) {
                    affichercompt();
                    compt--;
                }
                else
                {
                    this.timerService.removeTimeChangeListener(this);

                }

            }
        }
    }
}

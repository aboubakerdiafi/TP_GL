package org.emp.gl.core.launcher;


import org.emp.gl.clients.CompteARebours;
import org.emp.gl.clients.Horloge ;

import org.emp.gl.graphique.ButtonViewer;
import org.emp.gl.graphique.WatchViewer;
import org.emp.gl.lookup_module.Lookup;
import org.emp.gl.time.service.impl.DummyTimeServiceImpl;
import org.emp.gl.timer.service.TimerService;


/**
 * Hello world!
 *
 */
public class App {
    static {
// instanciation du service TimerService
// enregistrement dans le lookup
        TimerService timerService = new DummyTimeServiceImpl();
        Lookup.getInstance().subscribeService(TimerService.class,timerService);
    }
    public static void main ( String [] args ) {
// instanciation de l'interface graphique
        java . awt . EventQueue . invokeLater ( new Runnable () {
            public void run () {
                WatchViewer w = new WatchViewer () ;
                ButtonViewer b = new ButtonViewer (w ) ;
            }
        }) ;


    }

    private static void testDuTimeService(TimerService timerService) {
      //Horloge horloge = new Horloge("Num 1",timerService) ;

/** throw an exception that indicete a modificaion was detected during iterating
 *  (whene compt==0 it removed automaticlt but during iterating )
 *  **/
        CompteARebours compteur1 =new CompteARebours("compteur1",12,timerService);
        CompteARebours compteur2=new CompteARebours("compteur2",10,timerService);
        CompteARebours compteur3 =new CompteARebours("compteur3",15,timerService);
        CompteARebours compteur4 =new CompteARebours("compteur4",20,timerService);
        CompteARebours compteur5 =new CompteARebours("compteur5",17,timerService);
        CompteARebours compteur6 =new CompteARebours("compteur6",18,timerService);
        CompteARebours compteur7 =new CompteARebours("compteur7",18,timerService);
        CompteARebours compteur8 =new CompteARebours("compteur8",10,timerService);
        CompteARebours compteur9 =new CompteARebours("compteur9",22,timerService);
        CompteARebours compteur10 =new CompteARebours("compteur10",11,timerService);

    }
    private  static void testtp2(){
        Horloge horloge = new   Horloge("Horloge TP2");

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

package org.emp.gl.core.launcher;

import org.emp.gl.clients.Horloge ;
import org.emp.gl.time.service.impl.DummyTimeServiceImpl;
import org.emp.gl.timer.service.TimerService;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        TimerService timerService = new DummyTimeServiceImpl();
        testDuTimeService(timerService);
    }

    private static void testDuTimeService(TimerService timerService) {
        Horloge horloge1 = new Horloge("Num 1",timerService) ;
        Horloge horloge2 = new Horloge("Num 2",timerService) ;
        Horloge horloge3 = new Horloge("Num 3",timerService) ;
        Horloge horloge4= new Horloge("Num 4",timerService) ;
        Horloge horloge5 = new Horloge("Num 5",timerService) ;

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

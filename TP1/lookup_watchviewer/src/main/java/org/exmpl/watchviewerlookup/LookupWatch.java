package org.exmpl.watchviewerlookup;

import org.emp.gl.graphique.WatchViewer;

import java.util.HashMap;
import java.util.Map;


public class LookupWatch {
    // .. code permettant d assurer la fonctionnalite Singleton
    private static LookupWatch instance = null;
    private static Object luck = new Object();
    Map < String, WatchViewer> watches = new HashMap < >() ;

    public Map<String, WatchViewer> getWatches() {
        return watches;
    }

    public  void subscribeService (String watch , WatchViewer instance ) {
// TODO

        if (!watches.containsKey(watch))
            watches.put(watch, instance);
    }

    public WatchViewer getWatch ( String watch ) {
// TODO
        if(!watches.containsKey(watch))
            System.out.println("doesnt contain watch " + watch);
        return watches.get(watch);
    }

    public static LookupWatch getInstance() {
        if(instance==null)
            synchronized (luck) {
                if(instance==null){
                    instance = new LookupWatch();
                }

            }
        return instance;

    }


    private LookupWatch(){

    }

}


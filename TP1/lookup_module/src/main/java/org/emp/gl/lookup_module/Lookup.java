package org.emp.gl.lookup_module;

import java.util.HashMap;
import java.util.Map;

public class Lookup {
    // .. code permettant d assurer la fonctionnalite Singleton
    private static  Lookup instance=null;
    private static Object luck=new Object();
    Map < Class , Object > services = new HashMap < >() ;
    public <T > void subscribeService ( Class <? super T > service , T instance ) {
// TODO

        if (!services.containsKey(service))
            services.put(service, instance);
    }
    public <T > T getService ( Class <T > service ) {
// TODO
        if(!services.containsKey(service))
            System.out.println("doesnt contain service");
        return (T) services.get(service);
    }


    public static Lookup getInstance() {
        if(instance==null)
            synchronized (luck) {
            if(instance==null){
                instance = new Lookup();
            }

            }
        return instance;

    }


    private Lookup(){

    }


}

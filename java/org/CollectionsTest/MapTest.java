package org.CollectionsTest;

import java.security.Identity;
import java.util.*;

public class MapTest {

    public static void main(String[] args) throws InterruptedException {
        Map m = new HashMap();
        m.put("India", "Delhi");
        m.put("USA", "WashDC");
        m.put("China", "Nanking");
       /* System.out.println("Replaced "+m.put("China", "Beijing")+" with Beijing");

        System.out.println("Map " + m);

        System.out.println("Keys " + m.keySet());
        System.out.println("Values " + m.values());

        Set entrySetValues = m.entrySet();
        Iterator itr = entrySetValues.iterator();

        while (itr.hasNext()) {
            Map.Entry entryValue = (Map.Entry) itr.next();
            System.out.println("Key =" + entryValue.getKey() + " Value =" + entryValue.getValue());
        }*/

        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        m.put(i1,"Value1");
        m.put(i2,"Value2");

        IdentityHashMap ihm = new IdentityHashMap();
        ihm.put(i1,"Value1");
        ihm.put(i2,"Value2");

        WeakHashMap whm = new WeakHashMap();
        whm.put(i1,"Value1");
        whm.put(i2,"Value2");

        Temp1 t= new Temp1();
        m.put(t,"HashMap");
        whm.put(t,"WeakHashMap");
        System.out.println("HashMap"+m +"IdentityHashMap"+ ihm + "WeakhashMap" +whm);

        t=null;
        System.gc();
        Thread.sleep(5000);

        System.out.println("HashMap"+m +"IdentityHashMap"+ ihm + "WeakhashMap" +whm);
    }

    static class Temp1{
            public String toString(){
                return "temp";
            }
            public void finalize(){
                System.out.println("Finalize method is called");
            }
    }
}

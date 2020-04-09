package com.binio.algo.userstats;

import java.util.Iterator;
import java.util.Map;

public class VisitCounter {

    Map<Long, Long> count(Map<String, UserStats>... visits) {
        for(Map<String, UserStats> visit:visits){
            process(visit);
        }
        return null;
    }

    void process(Map<String, UserStats> map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, UserStats> pair = (Map.Entry) it.next();
            if(getIntFromString(pair.getKey()) > 0 && pair.getValue() != null) {

            }
            it.remove();
        }
    }

    public static Integer getIntFromString(String str) {
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }
}

package com.binio.algo.findprice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class PriceFind {

//    public static int[][] find(int[][] feed) {
//        int max = 0;
//
//        java.util.Arrays.sort(feed, new java.util.Comparator<int[]>() {
//            public int compare(int[] a, int[] b) {
//                return Double.compare(a[2], b[2]);
//            }
//        });
//
//        int[][] out = new int[feed.length][];
//
//        for(int i=0; i<feed.length; i++) {
//
//            int[] price1 = feed[i];
//
//            for(int l=0; l<feed.length; l++) {
//                int[] price2 = feed[l];
//
//                if(price1[2]<price2[2]) {
//                    if(price2[0]<price1[1]) {
//                        price2[0]=price1[1];
//                    }
//
//                    if(price1[0]<price2[1]) {
//                        price2[1]=price1[0];
//                    }
//                    out[l] = price2;
//                }
//                if(price1[2]==price2[2]){
//                    out[l] = price2;
//                }
//
//            }
//        }
//        return out;
//    }

    public static int[][] find(int[][] feed) {
        List list = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11);
        Map<Integer,Integer> results = new HashMap<>();

        java.util.Arrays.sort(feed, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Double.compare(a[2], b[2]);
            }
        });

        Collections.reverse(Arrays.asList(feed));


        for(int i = 0; i < feed.length; i++){

            int[] arr = feed[i];

            for(int k=0; k<list.size(); k++) {

                if(arr[0]<=k && k<arr[1]) {
                    results.computeIfPresent(k, (key, value) -> arr[2]);
                    results.computeIfAbsent(k, key -> arr[2]);
                } else {
                    results.computeIfAbsent(k, key -> 0);
                }
            }

        }


        int count = Collections.frequency(new ArrayList<Integer>(results.values()), "Red");

        System.out.println(results);
        return null;
    }

    public <K, V> Stream<K> keys(Map<K, V> map, V value) {
        return map
                .entrySet()
                .stream()
                .filter(entry -> value.equals(entry.getValue()))
                .map(Map.Entry::getKey);
    }
}

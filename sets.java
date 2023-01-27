package com.codediagnostics.irms.users;

import java.util.*;

public class sets {

    public static void main(String[] args) {
//        Set<String> a = new HashSet<>();
//        a.add("a");
//        a.add("b");
//        a.add("c");
//        a.add("d");
//        a.add("e");
//        Set<String> b = new HashSet<>();
//        b.add("d");
//        b.add("e");
//        b.add("f");
//        b.add("g");
//        b.add("h");
        ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b", "c","d","e"));
        ArrayList<String> b = new ArrayList<>(Arrays.asList("d", "e","f","g","h"));
        ArrayList<String> c = new ArrayList<>();
        ArrayList<String> d = new ArrayList<>();
//        c.removeAll(b);
        for(String st1 : a){
            for(String st2 : b){
                if(st2.equals(st1)){
                    c.add(st2);
                }
            }
        }

        for(String st1 : a){
            if(!c.contains(st1)){
                d.add(st1);
            }
        }




        System.out.println(d);

    }
}

package com.codediagnostics.irms.users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GoodString {
    public static void main(String[] args) {
        String s = "acabbc";
        boolean result = true;
        String sArr[] = s.split("");
        Set<String> stringSet = new HashSet<>(Arrays.asList(sArr));
        int ct = 0;
        Set<Integer> count = new HashSet<>();
        System.out.println(stringSet);
        for(String s1 : stringSet){
            for(String s2 : sArr){
                if(s2.equals(s1)){
                    ct++;
                }

            }
            count.add(ct);
            ct=0;
        }
            if(count.size()>1){
                System.out.println("Not Good");
            }else{
                System.out.println("Good");
            }

    }
}

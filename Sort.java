package com.codediagnostics.irms.users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        int a1[] = {10,20,40,30,50};
        int min = a1[0];
        int max = a1[0];
        for(int i=1;i< a1.length;i++){
            if(a1[i]<min){
                min = a1[i];
            }
            if(a1[i]>max){
                max = a1[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}

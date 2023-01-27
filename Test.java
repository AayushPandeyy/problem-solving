package com.codediagnostics.irms.users;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for(String s : arr){
            System.out.println(s);
        }
        System.out.println(str);
    }
}

package com.codediagnostics.irms.users;

import java.util.Scanner;

public class BotMultiple {
    public static void main(String[] args) {


        System.out.println("Input: ");
        Scanner sc = new Scanner(System.in);
        int x=0,y=0;
        String str = sc.nextLine().toUpperCase();
        String[] inpArr = str.split(" ");
        for(String inp : inpArr) {
            String lastTwo = inp.length() > 2 ? inp.substring(inp.length() - 2) : inp;
            int lastVal = Integer.parseInt(lastTwo);

            if (inp.contains("M")) {
                if (inp.startsWith("R")) {
                    x += lastVal;
                } else if (inp.startsWith("L")) {
                    x -= lastVal;
                } else {
                    System.out.println("Wrong Input");
                }
            } else {
                System.out.println("Wrong input");
            }
        }





        if(x>0){
            System.out.println("East("+x+","+y+")");

        } else if (x<0) {

            System.out.println("West("+x+","+y+")");
        }else {
            System.out.println("(0,0)");
        }
    }
}

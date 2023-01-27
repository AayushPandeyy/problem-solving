package com.codediagnostics.irms.users;

import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        System.out.println("Input: ");
        Scanner sc = new Scanner(System.in);
        String inp = sc.next().toUpperCase();

        int x=0,y=0;
        String lastTwo = inp.length() > 2 ? inp.substring(inp.length() - 2) : inp;
        int lastVal = Integer.parseInt(lastTwo);

        if(inp.contains("M")){
            if(inp.startsWith("R")){
                x+=lastVal;
                System.out.println("East("+x+","+y+")");
            } else if (inp.startsWith("L")) {
                x-=lastVal;
                System.out.println("West("+x+","+y+")");
            } else {
                System.out.println("Wrong Input");
            }
        }else {
            System.out.println("Wrong input");
        }

    }
}

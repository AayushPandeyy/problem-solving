package com.codediagnostics.irms.users;

import java.util.Scanner;

public class BasicSolution {


    public static void main(String[] args) {
        System.out.println("Input : ");
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine().toUpperCase();
        String[] inpArr = inp.split(" ");
        int x=0,y=0;

        int deg = 0;
        for(String str : inpArr){
            String lastTwo = str.length() > 2 ? str.substring(str.length() - 2) : str;
            int lastVal = Integer.parseInt(lastTwo);
            if(str.contains("M")){
                if(str.startsWith("L")){
                    if(deg==0){
                        x-=lastVal;
                        deg=270;
                    }else if(deg==90){
                        y+=lastVal;
                        deg-=90;
                    }else if(deg==180){
                        x+=lastVal;
                        deg-=90;
                    }else{
                        y-=lastVal;
                        deg-=90;
                    }
                } else if (str.startsWith("R")) {
                    if(deg==270){
                        y+=lastVal;
                        deg=0;
                    }else if(deg==0){
                        x+=lastVal;
                        deg+=90;
                    }else if(deg==90){
                        y-=lastVal;
                        deg+=90;
                    }else{
                        x-=lastVal;
                        deg+=90;
                    }
                }else {
                    System.out.println("Wrong input");
                }
            }
        }
        switch (deg){
            case 0:
                System.out.println("North:("+x+","+y+")");
                break;
            case 90:
                System.out.println("East:("+x+","+y+")");
                break;
            case 180:
                System.out.println("South:("+x+","+y+")");
                break;
            case 270:
                System.out.println("West:("+x+","+y+")");
                break;
            default:
                System.out.println("Ok");
                break;
        }

    }





}


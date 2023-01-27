package com.codediagnostics.irms.users;

public class Square {
    public static void main(String[] args) {
        int sum=0;
        int sumSquare=0;
        for(int i=1;i<=100;i++){
            sum+=i;
            sumSquare = sumSquare + (i*i);
        }
        System.out.println((sum*sum)-sumSquare);
    }
}

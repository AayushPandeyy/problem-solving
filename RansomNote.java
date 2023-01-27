package com.codediagnostics.irms.users;

import java.util.ArrayList;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        char[] s1 = ransomNote.toCharArray();
        char[] s2 = magazine.toCharArray();
        int count = 0;
        for(int x=0;x<s2.length;x++){
            for(int i=0;i<s1.length;i++){
                if(s1[i]==s2[x]){
                    count++;
                }
            }
        }
        if(count==s1.length){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}

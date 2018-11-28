package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {

        Pattern p3 = Pattern.compile("Feb(ruary)? 23(rd)?"); //??
        Matcher m3 =p3.matcher("February 23rd, February 23, Feb 23rd, Feb 23");
        while (m3.find()){
            System.out.println(m3.start()+" "+m3.group()+" ");
        }
        System.out.println("");
    }
}

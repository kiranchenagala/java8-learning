package com.kk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionsEx3 {
    public static void main(String[] args){

        List<String> list = new ArrayList<String>(){
            {
                add("test");
                add("kiran");
                add("learning");
            }
        } ;

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s2.length(), s1.length());
            }
        };
        Collections.sort(list, comp);
        list.forEach(System.out::println);

        //with Lambda expressions
        List<String> list2 = new ArrayList<String>(){
            {
                add("test");
                add("kiran");
                add("learning");
            }
        } ;
        Collections.sort(list2, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
        list2.forEach(System.out::println);
    }
}

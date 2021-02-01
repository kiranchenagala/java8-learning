package com.kk;

import java.io.File;
import java.io.FileFilter;
import java.util.function.Predicate;

public class LambdaExpressionsEx1 {

    public static void main(String[] args){
        File dir = new File("c://temp");

        //Before lambda expressions
        File[] javaFiles = dir.listFiles(new JavaFileFilter());

        //With Lambda expressions
        //Example 1:
        javaFiles = dir.listFiles((File f) -> f.getName().endsWith(".Java"));

        //Example 2:
        javaFiles = dir.listFiles(f -> f.getName().endsWith(".Java"));


    }
}

class JavaFileFilter implements FileFilter{

    public boolean accept(File file) {
        return file.getName().endsWith(".java");
    }
}
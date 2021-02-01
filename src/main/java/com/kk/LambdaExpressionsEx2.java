package com.kk;

public class LambdaExpressionsEx2 {

    public static void main(String[] args){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                new App().test();
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();

        //With Lamdba expressions

        Thread t2 = new Thread(() -> new App().test());
        t2.start();

        //For multiple lines
        Thread t3 = new Thread(() -> {
            System.out.println("calling test");
            new App().test();
           }
        );
        t3.start();
    }
}

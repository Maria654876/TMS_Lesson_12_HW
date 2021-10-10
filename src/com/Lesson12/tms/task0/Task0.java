package com.Lesson12.tms.task0;

public class Task0 {
    public static void main(String[] args) {
        ThreadTask0 T1=new ThreadTask0("T1");
        ThreadTask0 T2=new ThreadTask0("T2");
        ThreadTask0 T3=new ThreadTask0("T3");

        T3.start();

        try {
            T2.join();
            T1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        T2.start();
        T1.start();
    }
}

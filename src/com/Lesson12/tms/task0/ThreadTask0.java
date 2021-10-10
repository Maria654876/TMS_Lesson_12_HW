package com.Lesson12.tms.task0;

public class ThreadTask0 extends Thread {

    public ThreadTask0(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName()+"  Thread is live!");
        super.run();
    }
}

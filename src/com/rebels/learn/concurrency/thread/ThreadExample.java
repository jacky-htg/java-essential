package com.rebels.learn.concurrency.thread;

public class ThreadExample extends Thread {

    // run() method contains the code that is executed by the concurrency.
    @Override
    public void run() {
        System.out.println("Inside : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating concurrency...");
        Thread thread = new ThreadExample();

        System.out.println("Starting concurrency...");
        thread.start();
    }
}
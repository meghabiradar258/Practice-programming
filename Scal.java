package org.example;


public class Scal {
    final static String R1 = "Hello Welcome to Scaler!";
    final static String R2 = "Visit Scaler!";

    public static void main(String[] args) {
        // creating thread T1
        Thread T1 = new Thread() {
            public void run() {
                synchronized (R1) {
                    System.out.println("Thread T1 locked -> Resource R1");

                    try {
                        // Simulating some work with R1
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (R2) {
                        System.out.println("Thread T1 locked -> Resource R2");

                        // Work done with R2, notify other threads
                        R2.notifyAll();
                    }

                    // Work done with R1, notify other threads
                    R1.notifyAll();
                }
            }
        };

        // creating thread T2
        Thread T2 = new Thread() {
            public void run() {
                synchronized (R1) {
                    System.out.println("Thread T2 locked -> Resource R1");

                    try {
                        // Simulating some work with R1
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (R2) {
                        System.out.println("Thread T2 locked -> Resource R2");

                        // Work done with R2, notify other threads
                        R2.notifyAll();
                    }

                    // Work done with R1, notify other threads
                    R1.notifyAll();
                }
            }
        };

        // starting both the threads
        T1.start();
        T2.start();
    }
}

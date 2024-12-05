package org.example;

public class b {

        final static String R1 = "Hello Welcome to Scaler!";
        final static String R2 = "Visit Scaler!";

        private static boolean isR1Locked = false;  // To track R1 locking state
        private static boolean isR2Locked = false;  // To track R2 locking state

        public static void main(String[] args) {
            // creating thread T1
            Thread T1 = new Thread() {
                public void run() {
                    synchronized (R1) {
                        while (isR1Locked) {
                            try {
                                R1.wait(); // Wait if R1 is already locked
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        isR1Locked = true; // Mark R1 as locked
                        System.out.println("Thread T1 locked -> Resource R1");

                        synchronized (R2) {
                            while (isR2Locked) {
                                try {
                                    R2.wait(); // Wait if R2 is already locked
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            isR2Locked = true; // Mark R2 as locked
                            System.out.println("Thread T1 locked -> Resource R2");

                            // Work done, release R2
                            isR2Locked = false;
                            R2.notifyAll(); // Notify other threads waiting on R2
                        }

                        // Work done, release R1
                        isR1Locked = false;
                        R1.notifyAll(); // Notify other threads waiting on R1
                    }
                }
            };

            // creating thread T2
            Thread T2 = new Thread() {
                public void run() {
                    synchronized (R1) {
                        while (isR1Locked) {
                            try {
                                R1.wait(); // Wait if R1 is already locked
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        isR1Locked = true; // Mark R1 as locked
                        System.out.println("Thread T2 locked -> Resource R1");

                        synchronized (R2) {
                            while (isR2Locked) {
                                try {
                                    R2.wait(); // Wait if R2 is already locked
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            isR2Locked = true; // Mark R2 as locked
                            System.out.println("Thread T2 locked -> Resource R2");

                            // Work done, release R2
                            isR2Locked = false;
                            R2.notifyAll(); // Notify other threads waiting on R2
                        }

                        // Work done, release R1
                        isR1Locked = false;
                        R1.notifyAll(); // Notify other threads waiting on R1
                    }
                }
            };

            // starting both the threads
            T1.start();
            T2.start();
        }
    }


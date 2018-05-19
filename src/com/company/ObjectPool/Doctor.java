package com.company.ObjectPool;

public class Doctor {
    private static int counter = 1;

    private final int id;

    public Doctor() {
        id = counter++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Doctor id=%d", id);
    }
}

package com.company.Singleton;

public class Main {
    public static void main(String[] args) {
        DataBaseConnection connection1 = DataBaseConnection.getInstance();
        System.out.println(connection1);
        DataBaseConnection connection2 = DataBaseConnection.getInstance();
        System.out.println(connection2);

    }
}

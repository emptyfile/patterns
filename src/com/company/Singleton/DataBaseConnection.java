package com.company.Singleton;


public class DataBaseConnection {
    private static final String username = "zabyb";
    private static final String url = "myDB";
    private static final String password = "1234";
    private static DataBaseConnection ourInstance = new DataBaseConnection();

    public static DataBaseConnection getInstance() {
        return ourInstance;
    }

    private DataBaseConnection() {
        System.out.println("create connection with URL "+ url + " username: " + username + " password: " + password);
    }
}

package com.example.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

    public static void main(String[] args)
    {
        DatabaseManager databaseManager = DatabaseManager.getInstance();
        databaseManager.insertItem("Hello World");

        DatabaseManager databaseManager1 = DatabaseManager.getInstance();
        databaseManager1.removeItem("Hello World");

        System.out.println(databaseManager);
        System.out.println(databaseManager1);
    }

}

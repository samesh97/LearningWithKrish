package com.example.chainofresponsibility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChainOfResponsibilityApplication {

    public static void main(String[] args)
    {
       Level1 level1 = new Level1();
       Level2 level2 = new Level2();
       Level3 level3 = new Level3();

       level1.setSuccessor(level2);
       level2.setSuccessor(level3);



       level1.count();
    }

}

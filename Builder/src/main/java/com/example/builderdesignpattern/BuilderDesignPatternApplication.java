package com.example.builderdesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderDesignPatternApplication {

    public static void main(String[] args)
    {
        ProgressDialog.Builder builder1 = new ProgressDialog.Builder();
        ProgressDialog.Builder builder2 = new ProgressDialog.Builder();

        ProgressDialog dialog1 = builder1
                .title("Loading")
                .body("Please wait!")
                .touch(true)
                .backgroundColor("#FFFFFF")
                .textColor("#000000")
                .build();

        ProgressDialog dialog2 = builder2
                .title("Loading")
                .backgroundColor("#FFFFFF")
                .build();

        System.out.println(dialog1);
        System.out.println(dialog2);
    }

}

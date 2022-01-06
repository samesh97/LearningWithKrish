package com.example.chainofresponsibility;

public class Level2 extends Handler
{
    @Override
    public void count() {

        System.out.println("level 2 count started");

        for(int i = 11; i <= 20; i++)
        {
            System.out.println("" + i);
        }

        if(successor != null)
            successor.count();
    }
}

package com.example.chainofresponsibility;

public class Level3 extends Handler
{
    @Override
    public void count() {

        System.out.println("level 3 count started");

        for(int i = 21; i <= 30; i++)
        {
            System.out.println("" + i);
        }
        if(successor != null)
            successor.count();
    }
}

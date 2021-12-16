package com.example.chainofresponsibility;

public class Level1 extends Handler
{

    @Override
    public void count()
    {
        System.out.println("level 1 count started");

        for(int i = 1; i <= 10; i++)
        {
            System.out.println("" + i);
        }

        if(successor != null)
            successor.count();
    }
}

package com.example.chainofresponsibility;

public abstract class Handler
{
    protected Handler successor;

    public abstract void count();

    public void setSuccessor(Handler successor)
    {
        this.successor = successor;
    }
}

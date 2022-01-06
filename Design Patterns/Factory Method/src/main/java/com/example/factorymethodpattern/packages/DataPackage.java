package com.example.factorymethodpattern.packages;

import com.example.factorymethodpattern.datatime.Data;

import java.util.ArrayList;
import java.util.List;

public abstract class DataPackage
{
    private List<Data> data;

    public DataPackage()
    {
        data = new ArrayList<>();
        initPackage(data);
    }
    protected abstract void initPackage(List<Data> data);
}

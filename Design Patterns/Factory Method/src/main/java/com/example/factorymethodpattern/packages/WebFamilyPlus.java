package com.example.factorymethodpattern.packages;

import com.example.factorymethodpattern.datatime.Data;
import com.example.factorymethodpattern.datatime.DayTimeData;
import com.example.factorymethodpattern.datatime.NightTimeData;

import java.util.List;

public class WebFamilyPlus extends DataPackage
{
    @Override
    public void initPackage(List<Data> data)
    {
        data.add(new DayTimeData());
        data.add(new NightTimeData());
    }
}

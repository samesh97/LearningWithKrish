package com.example.factorymethodpattern;

import com.example.factorymethodpattern.packages.AnyFlix;
import com.example.factorymethodpattern.packages.DataPackage;
import com.example.factorymethodpattern.packages.WebFamilyPlus;
import com.example.factorymethodpattern.packages.NightPro;

public class DataPackageFactory
{
    public static DataPackage getDataPackage(DataPackageType type)
    {
        switch (type)
        {
            case NIGHT_PRO: return new NightPro();
            case ANY_FLIX: return new AnyFlix();
            case WEB_FAMILY_PLUS: return new WebFamilyPlus();
            default: return null;
        }
    }
}

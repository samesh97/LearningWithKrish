package com.example.factorymethodpattern;

import com.example.factorymethodpattern.packages.DataPackage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryMethodPatternApplication {

    public static void main(String[] args)
    {
        DataPackage dataPackage1 = DataPackageFactory.getDataPackage(DataPackageType.ANY_FLIX);
        DataPackage dataPackage2 = DataPackageFactory.getDataPackage(DataPackageType.NIGHT_PRO);
        DataPackage dataPackage3 = DataPackageFactory.getDataPackage(DataPackageType.WEB_FAMILY_PLUS);
    }

}

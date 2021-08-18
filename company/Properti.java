package com.company;

import java.util.*;
import java.io.*;
import java.util.Properties;

public class Properti {

    public static void main(String[] args)throws Exception{
        FileReader reader=new FileReader("C:\\Users\\DELL\\Desktop\\su.properties");

        Properties p=new Properties();
        p.load(reader);

        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("class"));
    }
}

package com.company;

// Java program to demonstrate working of method
// overloading in Java.

public class Overloaded {

        // Overloaded sum(). This sum takes two int parameters
        public int Overloaded(int x, int y)
        {
            return (x + y);
        }

        // Overloaded sum(). This sum takes three int parameters
        public int Overloaded(int x, int y, int z)
        {
            return (x + y + z);
        }

        // Overloaded sum(). This sum takes two double parameters
        public double Overloaded(double x, double y)
        {
            return (x + y);
        }

        // Driver code
        public static void main(String args[])
        {
            Overloaded s = new Overloaded();
            System.out.println(s.Overloaded(10, 20));
            System.out.println(s.Overloaded(10, 20, 30));
            System.out.println(s.Overloaded(10.5, 20.5));
        }
    }


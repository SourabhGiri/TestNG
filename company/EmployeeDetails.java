package com.company;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class EmployeeDetails {

        private String name;
        private double monthlySalary;
        private int age;
        @Test
        /**
         * @return the name
         */
        public String getName() {
            return name;
        }
        /**
         * @param name the name to set
         */
        public void setName(String name) {
            this.name = name;
        }
        /**
         * @return the monthlySalary 3. WRITING TESTS
        TestNG
        9
         */
        public double getMonthlySalary() {
            return monthlySalary;
        }
        /**
         * @param monthlySalary the monthlySalary to set
         */

        public void setMonthlySalary(double monthlySalary) {
            this.monthlySalary = monthlySalary;
        }
        /**
         * @return the age
         */
        public int getAge() {
            return age;
        }
        /**
         * @param age the age to set
         */
        public void setAge(int age) {
            this.age = age;
        }
    }


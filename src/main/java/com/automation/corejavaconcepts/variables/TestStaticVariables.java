package com.automation.corejavaconcepts.variables;

public class TestStaticVariables {
     /*Variable
    1.Static Variables :
        - Variables that are used in class level : Instance variables
        - It declared with static word
        - Static memory allocate during .class file creation
        - Static is not allowed withing method
        - Static methods are used for memory managment
        - Static variable bound with classes
        - Directly access in static and instace area
               */

    String empName = "Sachin";
    int empID = 100;
   static String companyName = "Microsoft";


    public void m1(){
        System.out.println(companyName);
    }

    public static void main(String[] args) {
        TestStaticVariables obj1 = new TestStaticVariables();
        //1st way:Recommended
        System.out.println(TestStaticVariables.companyName);
        obj1.m1();
    }
}

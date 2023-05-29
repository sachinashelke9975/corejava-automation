package com.automation.corejavaconcepts.variables;

public class TestInstanceVariables {
    /*Variable
    1.Instance Variables :
        - Variables that are used in class level : Instance variables
        - Instance variable are out-side method/constructor/blocks
        - Access throughout class/method/constructor/blocks
        - No need to initialised
        - Instance variable can not be access directly in static area
        -  Stored in heap memory
       */
    int a = 10;
    String name = "Mudra";
    boolean flag = true;
    char [] ch = {'a', 'b'};

    public void m1(){
      String name = "Sachin";
        //System.out.println(name);
    }

    static {
        // System.out.println(name); : Unable to use
        // Access by using object creation
        TestInstanceVariables t1 = new TestInstanceVariables();
        System.out.println(t1.flag);
    }

    public static void main (String [] args){
        TestInstanceVariables t1 = new TestInstanceVariables();
        System.out.println(t1.name);

    }
}

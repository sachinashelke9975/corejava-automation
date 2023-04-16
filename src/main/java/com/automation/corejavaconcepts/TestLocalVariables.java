package com.automation.corejavaconcepts;

public class TestLocalVariables {
    /*Variable
    1.Local Variables :
        - Local variables are present in method/constructor/blocks
        - Scope : method/constructor/blocks
        - local variable are stored in inside stack memory
       */
    public void m1() {
        int age =12;
        System.out.println(age);
    }
    public static void main(String[] args) {
        int age = 10;
        System.out.println(age);
        TestLocalVariables t1 = new TestLocalVariables();
        t1.m1();
    }


}

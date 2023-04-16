package com.automation.corejavaconcepts.variables;

public class TestLocalVariables {
    /*Variable
    1.Local Variables :
        - Local variables are present in method/constructor/blocks
        - Scope : method/constructor/blocks
        - local variable are stored in inside stack memory
        - Local variable always need to initialised
        - Priority always provided to local variable if variable same name provided
       */
    public void m1() {
        int age =12;//Local scope
        System.out.println(age);
    }
    public static void main(String[] args) {
        int age = 10;
        System.out.println(age);
        TestLocalVariables t1 = new TestLocalVariables();
        t1.m1();
    }


}

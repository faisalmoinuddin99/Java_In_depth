package com.company;

/*
strictfp keyword in java :

- strictfp is a keyword in java used for restricting floating-point calculations and ensuring same result on every platform while performing operations in the floating-point variable.
Floating point calculations are platform dependent i.e. different output(floating-point values) is achieved when a class file is run on different platforms(16/32/64 bit processors).
To solve this types of issue, strictfp keyword was introduced in JDK 1.2 version by following IEEE 754 standards for floating-point calculations.

- When a class or an interface is declared with strictfp modifier, then all methods declared in the class/interface, and all nested types declared in the class, are implicitly strictfp.

- strictfp cannot be used with abstract methods. However, it can be used with abstract classes/interfaces.
- Since methods of an interface are implicitly abstract, strictfp cannot be used with any method inside an interface.
 */

strictfp interface Sum {
    double sum(float a, float b);
}

class Calculator implements Sum {


    @Override
    public double sum(float x, float y) {
        return x + y;
    }
}

public class Main {


    public static void main(String[] args) {

    Calculator ca = new Calculator();
        System.out.println(ca.sum(86.7f, 3.14f)); // 89.83999633789062


    }
}

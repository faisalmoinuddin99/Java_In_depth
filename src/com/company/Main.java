package com.company;


public class Main {


    public static void main(String[] args) {

   boolean x = false;
   if(!x){
       System.out.println("hello"); // hello
   }else {
       System.out.println("hi");
   }
    double d = 10e2 ; // Exponential expression 10 * 10 ^ 2
        System.out.println(d); // 1000.0

        float f = 5e2f ; // ==> 5 * 5 ^ 2
        System.out.println(f); // 500.0

        char ch = 97 ;
        for(ch = 97; ch <= 101; ch++) {
            System.out.println(ch);
        }

        char c = 0xFa ;
        System.out.println(c); // ú

        double v = 10_10_78;
        System.out.println(v);

        double cha = 'a';
        System.out.println(cha); // 97.0

        int chac = 'a';
        System.out.println(chac); // 97

        double test = 57;
        System.out.println(test); // 57


    }
}

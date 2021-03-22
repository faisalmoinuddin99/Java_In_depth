package com.company;

public class Main {

    /*
    which of the following valid java identifier
     */
    public static void main(String[] args) {
// write your code here
        int _$_ = 10 ; // valid
        int ca$h = 1000 ; // valid
        String java2share = "yes" ; // valid
//        int all@hands  --> invalid
//        int 123abc  -- > invalid
        int $hello = 6 ; // valid
        int Int = 60 ; // valid ( not a good practice )
        int Integer = 80; // valid ( not a good practice )
//        int int --> invalid
        int total234 = 90 ; // valid

        System.out.println(_$_); // 10
        System.out.println(ca$h); // 1000
        System.out.println(java2share); // yes
        System.out.println($hello); // 6
        System.out.println(Int); // 60
        System.out.println(Integer); // 80
        System.out.println(total234); // 90
    }
}

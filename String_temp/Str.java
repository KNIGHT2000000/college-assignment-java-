package String_temp;

import java.sql.SQLOutput;

public class Str {
    public static void main(String[] args) {
        String s1 = "hello";
        String S2 = new String("world");
        System.out.println(s1);
        System.out.println(S2);
//        System.out.println(s1 == S2);
//        System.out.println(s1.equals(S2));

//        System.out.println(s1= "hell");
////working with immutability of string
//        System.out.println(s1);
//        System.out.println(S2);
//        //writing  a code to proof immutability of string
//        String s3 = s1;
//        System.out.println(s3);
//        s1 = "hello world";
//        System.out.println(s1);
//        System.out.println(s3);
        //why java is designed to be immutable
        //1. security: string is used in many places like file name, network connection,
        //2. string pool: java maintains a string pool to save memory, if string is immutable then we can reuse the same string in the pool
        //3. thread safety: string is immutable, so it is thread safe, we can
        //4. performance: string is immutable, so it is faster than mutable string like StringBuilder and StringBuffer
//
         //how java is immulatble
        //1. string class is final, so it cannot be extended
        //2. string class has no setter method, so we cannot change the value of string
        //3. string class has a constructor that takes a char array, but it creates a
        //   new string object, so it does not change the original string
        //4. string class has a method called intern() that returns a string from the string
        //   pool, if the string is already in the pool, it returns the same string, otherwise it adds the string to the pool and returns it
        //5. string class has a method called concat() that concatenates two strings, but
        //   it creates a new string object, so it does not change the original string
        //code to show immutability of string using object and reference
        String s4 = "hello";
        String s5 = s4;
        System.out.println(s4);
        System.out.println(s5);
        s4 = "hello world";
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
        //difference with int type
        int a = 10;
        int b = a;
        System.out.println(a);
        System.out.println(b);
        a = 20;
        System.out.println(a);
        System.out.println(b);
 //the output is same as string so how does it differs son is int immutable too
 Integer a1 =new Integer(5);
    Integer b1 = a1;
        System.out.println(a1);
        System.out.println(b1);
        a1 = new Integer(10);
        System.out.println(a1);
        System.out.println(b1);
        // now working for string concat to show immutability of string
        String s6 = "hello";
        String s7 = s6.concat(" world");
        System.out.println(s6.hashCode());
        System.out.println(s6.hashCode());//hashcode of s6 and s7 will be different because they are different objects in memory
        System.out.println(s7.hashCode());
        s6= s6.concat(" world");//hashcode of s6 and s7 will be different because they are different objects in memory

        System.out.println(s6.hashCode());//hashcode of this s6 is same as s7 because they are same objects in memory
        System.out.println(s7.hashCode());





    }}

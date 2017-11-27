//HackerRank Intro


//Solution 1
//You must print two lines of output:
//Print Hello, World. on the first line.
//Print Hello, Java. on the second line.

public class Solution {

    public static void main(String[] args) {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
        
    }
}


//Solution 2
//In this challenge, you must read 3 integers from stdin and then print them to stdout. 
//Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt(); 

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}


//Solution 3
//Given an integer, n, perform the following conditional actions:
//If n is odd, print Weird
//If n is even and in the inclusive range of 2 to 5, print Not Weird
//If n is even and in the inclusive range of 6 to 20, print Weird
//If n is even and greater than 20, print Not Weird
//Complete the stub code provided in your editor to print whether or not  is weird.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String ans="";
        if((n%2==1) || ((n >= 6) && (n <= 20))){
			ans = "Weird";
        }
        else{
            
            ans = "Not Weird";
                
        }
        System.out.println(ans);
            
    }
}


//Solution 4
//There are three lines of output:
//On the first line, print String: followed by the unaltered String read from stdin.
//On the second line, print Double: followed by the unaltered double read from stdin.
//On the third line, print Int: followed by the unaltered integer read from stdin.
//To make the problem easier, a portion of the code is already provided in the editor.

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

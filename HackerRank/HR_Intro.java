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


//Solution 5
//In each line of output there should be two columns: 
//The first column contains the String and is left justified using exactly 15 characters. 
//The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d\n", s1, x);
            }
            System.out.println("================================");

    }
}


//Solution 6
//Given an integer, N, print its first 10 multiples. Each multiple N * i (where 1<=i<=10 ) should be printed on a new line in the form: N x i = result.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <= 10; ++i){
            System.out.printf("%d x %d = %d\n", N, i, N*i);
        }
    }
}


//Solution 7
//https://www.hackerrank.com/challenges/java-loops/problem

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            for(int j = 0; j < n; ++j){
                sum += (int)Math.pow(2, j) * b;
                System.out.printf("%d ", sum);
            }
            System.out.println("");
        }
        in.close();
    }
}


//Solution 8
//https://www.hackerrank.com/challenges/java-datatypes/problem

import java.util.*;
import java.io.*;


class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-Math.pow(2, 31) && x<=(Math.pow(2, 31) - 1))System.out.println("* int");
                if(x>=-Math.pow(2, 63) && x<=(Math.pow(2, 63) - 1))System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}


//Solution 9
//https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()){
            System.out.println(++n + " " + sc.nextLine());
        }
    }
}


//Solution 10
//https://www.hackerrank.com/challenges/java-static-initializer-block/problem

static int B, H;
static boolean flag = true;

static {
    Scanner sc = new Scanner(System.in);
    B = sc.nextInt();
    H = sc.nextInt();
    if (B <= 0 || H <= 0){
        flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}


//Solution 11
//https://www.hackerrank.com/challenges/java-int-to-string/problem

   String s = n + "";
   
   
//Solution 12
//https://www.hackerrank.com/challenges/java-date-and-time/problem

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class Solution {
    public static String getDay(String day, String month, String year) {
        
        GregorianCalendar calendar = new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        switch(weekday){
            case Calendar.MONDAY:
                return "MONDAY";
            case Calendar.TUESDAY:
                return "TUESDAY";
            case Calendar.WEDNESDAY:
                return "WEDNESDAY";
            case Calendar.THURSDAY:
                return "THURSDAY";
            case Calendar.FRIDAY:
                return "FRIDAY";
            case Calendar.SATURDAY:
                return "SATURDAY";
            case Calendar.SUNDAY:
                return "SUNDAY";
        }
        return "";
        
    }
	
	
//Solution 13
//https://www.hackerrank.com/challenges/java-currency-formatter/problem


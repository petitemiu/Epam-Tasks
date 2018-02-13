//Solution 1
//https://www.hackerrank.com/challenges/java-biginteger/problem

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        System.out.println( a.add(b));
        System.out.println( a.multiply(b));
    }
}


//Solution 2
//https://www.hackerrank.com/challenges/java-bigdecimal/problem

s[n] = "Nope";
s[n+1] = "Nope";
Arrays.sort(s,((String number1,String number2) ->  {
	if (!(number1.equals("Nope")) && !(number2.equals("Nope"))){
		BigDecimal value1 = new BigDecimal(number1);
        BigDecimal value2 = new BigDecimal(number2);
        return value2.compareTo(value1);
		}
    return 0;
}));


//Solution 3
//https://www.hackerrank.com/challenges/java-primality-test/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      String result = "prime";
      if (!n.isProbablePrime(1)){
          result = "not prime";
      }
       System.out.println(result);
      // Write your code here.
   }
    
}

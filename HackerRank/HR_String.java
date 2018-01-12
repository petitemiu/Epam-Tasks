//Solution 1
//https://www.hackerrank.com/challenges/java-strings-introduction/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
    }
}


//Solution 2
//https://www.hackerrank.com/challenges/java-substring/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }
}


//Solution 3
//https://www.hackerrank.com/challenges/java-string-compare/problem

import java.util.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i < s.length()-k+1; i++) {
            String curr = s.substring(i, i+k);
            smallest = smallest.compareTo(curr) > 0 ? curr : smallest;
            largest = largest.compareTo(curr) < 0 ? curr : largest;
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}


//Solution 4
//https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int len = A.length();
        boolean isPalindrome = true;
        for (int i = 0; i < len/2; i++) {
            if(A.charAt(i)!=A.charAt(len-i-1)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "Yes" : "No");
    }
}


//Solution 5
//https://www.hackerrank.com/challenges/java-anagrams/problem

    static boolean isAnagram(String a, String b) {
          if (a.length()!=b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        if (a.equals(b)){
            return true;
        }
        
        Map<String, Integer> lettersA = new HashMap<>();
        Map<String, Integer> lettersB = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            String currentLetterA = a.substring(i, i+1);
            String currentLetterB = b.substring(i, i+1);

            if(lettersA.containsKey(currentLetterA)){
                lettersA.put(currentLetterA, lettersA.get(currentLetterA)+1);
            }
            else {
                lettersA.put(currentLetterA, 1);
            }

            if(lettersB.containsKey(currentLetterB)){
                lettersB.put(currentLetterB, lettersB.get(currentLetterB)+1);
            }
            else {
                lettersB.put(currentLetterB, 1);
            }
        }
        return lettersA.equals(lettersB);
    }

	
//Solution 6
//https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if (s.length()==0){
            System.out.print(0);
        }
        else{
            s = s.replaceAll("[^\\p{Alpha}]+", " ").trim();
            if(s.isEmpty()) {
                System.out.println(0);
            }
            else{
                String[] tokens = s.trim().split("[ !,?._'@]+");
                System.out.println(tokens.length);
                for(String str : tokens){
                    System.out.println(str);
                }
            }
        }
        scan.close();
    }
}


//Solution 7
//https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String pattern = in.nextLine();
         try{
             Pattern.compile(pattern);
         }
         catch(Exception e){
             System.out.println("Invalid");
             continue;
         }
          System.out.println("Valid");
      }
   }
}


//Solution 8
//https://www.hackerrank.com/challenges/java-regex/problem

class MyRegex{
    String pattern = "^((([01]?[0-9]{1,2})|([0-2](([0-4][0-9])|([0-5]{2}))))\\.){3}(([01]?[0-9]{1,2})|([0-2](([0-4][0-9])|([0-5]{2}))))$";
}

//Solution 9
//https://www.hackerrank.com/challenges/duplicate-word/problem

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}


//Solution 10
//https://www.hackerrank.com/challenges/valid-username-checker/problem


class UsernameValidator {
    public static final String regularExpression = "\\p{Alpha}\\w{7,29}";
}

//Solution 11
//https://www.hackerrank.com/challenges/tag-content-extractor/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      String regex = "<(.+)>([^<]+)</\\1>";
      Pattern p = Pattern.compile(regex);
      while(testCases>0){
         String line = in.nextLine();
         Matcher m = p.matcher(line);
         if(m.find()){
             do{
             System.out.println(m.group(2));
             }while(m.find());
         }
         else{
             System.out.println("None");
         }
         testCases--;
      }
   }
}
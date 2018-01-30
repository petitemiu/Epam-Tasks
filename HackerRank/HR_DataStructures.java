//Solution 1
//https://www.hackerrank.com/challenges/java-1d-array-introduction/problem

int[] a = new int[n];
for(int i = 0 ; i < n; i++){
    int val = scan.nextInt();
    a[i] = val;
}

//Solution 2
//https://www.hackerrank.com/challenges/java-2d-array/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int sum = Integer.MIN_VALUE;
        for(int i=0; i <= 3; ++i){
            for(int j=0; j <= 3; ++j){
                int currSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                              arr[i+1][j+1] + 
                              arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                sum = currSum > sum ? currSum : sum;
            }
        }
        System.out.println(sum);
    }
}


//Solution 3
//https://www.hackerrank.com/challenges/java-negative-subarray/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            if(arr[i] < 0) ++count;
        }        
        
        for(int i=0; i < n; ++i){
            int sum = arr[i];
            for(int j=i+1; j < n; ++j){
                sum += arr[j];
                count += sum < 0 ? 1 : 0;
            }
        }
        System.out.println(count);
    }
}

//Solution 4
//https://www.hackerrank.com/challenges/java-arraylist/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linesCount = in.nextInt();
        List<Integer[]> lines = new ArrayList<>(linesCount);
        
        for (int i = 0; i < linesCount; ++i){
            int items = in.nextInt();
            Integer[] line = new Integer[items];
            for (int j = 0; j < items; ++j){
                line[j] = in.nextInt();
            }
            lines.add(line);
        }
                
        int queriesCount = in.nextInt();
        for (int i = 0; i < queriesCount; ++i){
            int lineNum = in.nextInt()-1;
            int valueNum = in.nextInt()-1;
            Integer[] line = lines.get(lineNum);
            if (valueNum < line.length){
                System.out.println(line[valueNum]);
            }
            else{
                System.out.println("ERROR!");
            }
        }
    }
}


//Solution 5
//https://www.hackerrank.com/challenges/java-1d-array/problem


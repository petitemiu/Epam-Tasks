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

import java.util.*;

public class Solution {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}


//Solution 6
//https://www.hackerrank.com/challenges/java-list/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int value = scan.nextInt();
            list.add(value);
        }
        
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String cmd = scan.next();
            if (cmd.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else { // "Delete"
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();
        
        /* Print our updated List */
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}


//Solution 7
//https://www.hackerrank.com/challenges/phone-book/problem

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []args)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      Map<String, Integer> book = new HashMap<>(n);
      in.nextLine();
      for(int i=0;i<n;i++){
         String name=in.nextLine();
         int phone=in.nextInt();
         book.put(name, phone);
         in.nextLine();
      }
      while(in.hasNext()){
         String name=in.nextLine();
         Integer number = null;
          if((number = book.get(name)) != null){
              System.out.println(name + "=" + number);
          } 
          else{
             System.out.println("Not found"); 
          }
      }
   }
}


//Solution 8
//https://www.hackerrank.com/challenges/java-stack/problem

import java.util.*;
class Solution{
   
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
         String input=sc.nextLine();
         System.out.println(checkBrackets(input));       
      }
   }
    public static boolean checkBrackets(String str){
        if(str.length()%2==1){
            return false;
        }
        Deque<String> stack = new ArrayDeque<>();
        boolean balanced = true;
        for(int i = 0; i < str.length(); ++i){
            String c = str.substring(i, i+1);
            if(c.equals("(") || c.equals("{") || c.equals("[")){
                stack.push(c);
             }
             else{
                 if(stack.isEmpty()){
                     return false;
                 }
                 switch(c){
                    case ")":
                        if(!stack.pop().equals("(")){
                            balanced = false;
                        }
                        break;
                    case "}":
                        if(!stack.pop().equals("{")){
                            balanced = false;
                        }
                        break;
                    case "]":
                        if(!stack.pop().equals("[")){
                            balanced = false;
                        }
                        break;
                }
             }
            if(!balanced){
                return false;
            }
         }
        return balanced;
    }
}


//Solution 9
//https://www.hackerrank.com/challenges/java-hashset/problem

Set<String> set = new HashSet<>();
    for(int i = 0; i < t; ++i){
        set.add(pair_left[i] + " " + pair_right[i]);
        System.out.println(set.size());
    }
		
//Solution 10
//https://www.hackerrank.com/challenges/java-generics/problem

class Printer<T>
{
   public void printArray(T[] array){
       for(T elem : array){
           System.out.println(elem);
       }
   }
}

//Solution 11
//https://www.hackerrank.com/challenges/java-comparator/problem

class Checker implements Comparator<Player>{
    @Override
    public int compare(Player a, Player b){
        if(b.score == a.score) return a.name.compareTo(b.name);
        return b.score - a.score;
    } 
}


//Solution 12
//https://www.hackerrank.com/challenges/java-sort/problem

import java.util.*;

class Student implements Comparable<Student>{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
    @Override
   public int compareTo(Student student){
       if(this.cgpa == student.cgpa){
           if(this.fname.compareTo(student.fname) == 0){
               return this.id - student.id;
           }
           return this.fname.compareTo(student.fname);
       } 
       if(this.cgpa - student.cgpa > 0){
           return -1;
       }
       return 1;
   }
}

public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }     
      Collections.sort(studentList);
      for(Student st: studentList){
      System.out.println(st.getFname());
      }
   }
}


//Solution 13
//https://www.hackerrank.com/challenges/java-dequeue/problem

	import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            HashSet<Integer> set = new HashSet<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int max = 0;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.add(num);
                set.add(num);
            
                if (deque.size() == m) {
                    if (set.size() > max) max = set.size();
                    int first = deque.remove();
                    if (!deque.contains(first)) set.remove(first);
                }
            }
            System.out.println(max);
        }
    }

//Solution 14
//https://www.hackerrank.com/challenges/java-bitset/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        for(int i = 0; i < m; ++i){
            String command = in.next();
            int arg1 = in.nextInt();
            int arg2 = in.nextInt();
            switch (command){
                case "AND":
                    if (arg1 == 1){
                        b1.and(b2);
                    }
                    else {
                        b2.and(b1);
                    }
                    break;
                case "OR":
                    if (arg1 == 1){
                        b1.or(b2);
                    }
                    else {
                        b2.or(b1);
                    }
                    break;
                case "XOR":
                    if (arg1 == 1){
                        b1.xor(b2);
                    }
                    else {
                        b2.xor(b1);
                    }
                    break;
                case "FLIP":
                    if (arg1 == 1){
                        b1.flip(arg2);
                    }
                    else {
                        b2.flip(arg2);
                    }
                    break;
                case "SET":
                    if (arg1 == 1){
                        b1.set(arg2);
                    }
                    else {
                        b2.set(arg2);
                    }
                    break;
            }
            System.out.println("" + b1.cardinality() + " " + b2.cardinality());
        }
    }
}


//Solution 15
//https://www.hackerrank.com/challenges/java-priority-queue/problem

import java.util.PriorityQueue;

class Student implements Comparable<Student>{
    private int id;
    private double cgpa;
    private String fname;
    
    public Student(int id, String name, double cgpa){
        this.id = id;
        this.fname = name;
        this.cgpa = cgpa;
    }
    
    public int getID(){
        return this.id;
    }
    public double getCGPA(){
        return this.cgpa;
    }
    public String getName(){
        return this.fname;
    }
    
    @Override
    public int compareTo(Student student){
       if(this.cgpa == student.cgpa){
           if(this.fname.compareTo(student.fname) == 0){
               return this.id - student.id;
           }
           return this.fname.compareTo(student.fname);
       } 
       if(this.cgpa - student.cgpa > 0){
           return -1;
       }
       return 1;
   }
}

class Priorities{
    
    public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> students = new PriorityQueue<>();
        
        for(String event : events){
            if(event.equals("SERVED")){
                  students.poll();
            } 
            else{
                students.add(eventToStudent(event));
            }
        }
        students.peek();
        return new ArrayList(students);
    }
    
    private Student eventToStudent(String event){
        String[] fields = event.split(" ");
        int id = Integer.parseInt(fields[3]);
        String name = fields[1];
        double cgpa = Double.parseDouble(fields[2]);
        return new Student(id, name, cgpa);
    }
    
}
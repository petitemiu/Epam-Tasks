//Solution 1
//https://www.hackerrank.com/challenges/simple-addition-varargs/problem

class Add{
    public void add(int... args){
        int sum = 0;
        for(int i = 0; i < args.length-1; ++i){
            System.out.print(args[i] + "+");
            sum += args[i];
        }
        sum += args[args.length-1];
        System.out.println(args[args.length-1] + "=" + sum);
    }
}


//Solution 2
//https://www.hackerrank.com/challenges/java-reflection-attributes/problem

public class Solution {

        public static void main(String[] args){
            Class student = Student.class;
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method m : methods){
                methodList.add(m.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }

	}

	
//Solution 3
//https://www.hackerrank.com/challenges/can-you-access/problem

o = new Inner().new Private();
System.out.println(num + " is " + ((Solution.Inner.Private)o).powerof2(num));
			
		
//Solution 4
//https://www.hackerrank.com/challenges/prime-checker/problem

import static java.lang.System.in;

class Prime{
    public void checkPrime(int... nums){
        boolean isPrime = true;
        for(int num : nums){
            if(num < 2) isPrime = false;
            for(int i=2;i<num;i++) {
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) System.out.print(num + " ");
            isPrime = true;
        }
        System.out.println();
    }
}


//Solution 5
//https://www.hackerrank.com/challenges/java-singleton/problem


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    private volatile static Singleton instance;
    public String str;
    private Singleton(){}
    static Singleton getSingleInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    } 
}


//Solution 6
//https://www.hackerrank.com/challenges/java-vistor-pattern/problem

class SumInLeavesVisitor extends TreeVis {
    private int result = 0;

    public int getResult() {
        return result;
    }

    public void visitNode(TreeNode node) {
    }

    public void visitLeaf(TreeLeaf leaf) {
        result += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private long result = 1;
    private final int M = 1000000007;

    public int getResult() {
        return (int) result;
    }

    public void visitNode(TreeNode node) {
        if(node.getColor().equals(Color.RED)) {
            result = (result * node.getValue()) % M;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if(leaf.getColor().equals(Color.RED)) {
            result = (result * leaf.getValue()) % M;
        }
    }
}

class FancyVisitor extends TreeVis {
    private int evenDepthNonLeavesSum = 0;
    private int greenLeavesSum = 0;

    public int getResult() {
        return Math.abs(evenDepthNonLeavesSum - greenLeavesSum);
    }

    public void visitNode(TreeNode node) {
        if(node.getDepth() % 2 == 0)
            evenDepthNonLeavesSum += node.getValue();
    }

    public void visitLeaf(TreeLeaf leaf) {
        if(leaf.getColor().equals(Color.GREEN))
            greenLeavesSum += leaf.getValue();
    }
}

public class Solution {
        static int N;
        static HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        static int[] values;
        static int[] colors;
        static boolean [] mark;
        
        public static Tree dfs(int vertex){
            if(map.get(vertex).isEmpty())
                return new TreeLeaf(values[vertex], Color.values()[colors[vertex]], 0);
            else{
                mark = new boolean[N];
                return runDfs(vertex, 0);
            }
        }
    
        public static Tree runDfs(int vertex, int depth){
            mark[vertex] = true;
            ArrayList<Tree> childs = new ArrayList<>();
            for(Integer e : map.get(vertex))
                if(!mark[e])
                    childs.add(runDfs(e, depth + 1));
            if(childs.isEmpty())
                return new TreeLeaf(values[vertex], Color.values()[colors[vertex]], depth);
            else{
                TreeNode node = new TreeNode(values[vertex], Color.values()[colors[vertex]], depth);
                for(Tree child : childs)
                    node.addChild(child);
                return node;
            }
        }
    
        public static Tree solve() {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                N = Integer.valueOf(br.readLine());
                values = new int[N];
                colors = new int[N];
                int parent, child;
                String[] chunks = br.readLine().split(" ");
                for(int i = 0; i < N; i++ ){
                    map.put(i, new HashSet<Integer>());
                    values[i] = Integer.valueOf(chunks[i]);
                }   
                chunks = br.readLine().split(" ");
                for(int i = 0; i < N; i++ )
                    colors[i] = Integer.valueOf(chunks[i]);
                for(int i = 0, length = N - 1; i < length; i++){
                    chunks = br.readLine().split(" ");
                    parent = Integer.valueOf(chunks[0]) - 1;
                    child = Integer.valueOf(chunks[1]) - 1;

                    map.get(parent).add(child);
                    map.get(child).add(parent);

                }
                return dfs(0);
            } catch (IOException ex) {

        }
        return null;
    }   
	
	
//Solution 7
//https://www.hackerrank.com/challenges/java-annotations/problem

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
   String userRole() default "GUEST";
   int budget();
}

class FamilyMember {
   @FamilyBudget(userRole = "SENIOR", budget = 100)
   public void seniorMember(int budget, int moneySpend) {
      System.out.println("Senior Member");
      System.out.println("Spend: " + moneySpend);
      System.out.println("Budget Left: " + (budget - moneySpend));
   }

   @FamilyBudget(userRole = "JUNIOR", budget = 50)
   public void juniorUser(int budget, int moneySpend) {
      System.out.println("Junior Member");
      System.out.println("Spend: " + moneySpend);
      System.out.println("Budget Left: " + (budget - moneySpend));
   }
}

public class Solution {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while (testCases > 0) {
         String role = in.next();
         int spend = in.nextInt();
         try {
            Class annotatedClass = FamilyMember.class;
            Method[] methods = annotatedClass.getMethods();
            for (Method method : methods) {
               if (method.isAnnotationPresent(FamilyBudget.class)) {
                  FamilyBudget family = method
                        .getAnnotation(FamilyBudget.class);
                  String userRole = family.userRole();
                  int budgetLimit = family.budget();
                  if (userRole.equals(role)) {
                     if(budgetLimit >= spend){
                        method.invoke(FamilyMember.class.newInstance(),
                              budgetLimit, spend);
                     }else{
                        System.out.println("Budget Limit Over");
                     }
                  }
               }
            }
         } catch (Exception e) {
            e.printStackTrace();
         }
         testCases--;
      }
   }
}
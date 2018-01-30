//Solution 1
//https://www.hackerrank.com/challenges/java-inheritance-1/problem

class Bird extends Animal{
	void fly(){
		System.out.println("I am flying");
	}
    void sing(){
		System.out.println("I am singing");        
    }
}


//Solution 2
//https://www.hackerrank.com/challenges/java-inheritance-2/problem

class Arithmetic{
    Integer add(Integer a, Integer b){
        return a + b;
    }
}

class Adder extends Arithmetic{
    
}


//Solution 3
//https://www.hackerrank.com/challenges/java-abstract-class/problem

class MyBook extends Book{
    @Override
    void setTitle(String s){
        this.title = s;
    }
}

//Solution 4
//https://www.hackerrank.com/challenges/java-interface/problem

class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n){
        int sum = n;
        for (int i = 1; i < n; ++i){
            if (n%i == 0){
                sum+=i;
            }
        }
        return sum;
    }
}


//Solution 5
//https://www.hackerrank.com/challenges/java-method-overriding/problem
 
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
	
//Solution 6
//https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem

	String temp=super.define_me(); 

	
//Solution 7
//https://www.hackerrank.com/challenges/java-instanceof-keyword/problem

import java.util.*;


class Student{}
class Rockstar{   }
class Hacker{}


public class InstanceOFTutorial{
   
   static String count(ArrayList mylist){
      int a = 0,b = 0,c = 0;
      for(int i = 0; i < mylist.size(); i++){
         Object element=mylist.get(i);
         if(element instanceof Student)
            a++;
         if(element instanceof Rockstar)
            b++;
         if(element instanceof Hacker)
            c++;
      }
      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
      return ret;
   }

   public static void main(String []args){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for(int i=0; i<t; i++){
         String s=sc.next();
         if(s.equals("Student"))mylist.add(new Student());
         if(s.equals("Rockstar"))mylist.add(new Rockstar());
         if(s.equals("Hacker"))mylist.add(new Hacker());
      }
      System.out.println(count(mylist));
   }
}


//Solution 8
//https://www.hackerrank.com/challenges/java-iterator/problem

import java.util.*;
public class Main{
   
   static Iterator func(ArrayList mylist){
      Iterator it=mylist.iterator();
      while(it.hasNext()){
         Object element = it.next();
         if(element instanceof String)
            break;
      }
      return it;
      
   }
   @SuppressWarnings({ "unchecked" })
   public static void main(String []args){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      for(int i = 0;i<n;i++){
         mylist.add(sc.nextInt());
      }
      
      mylist.add("###");
      for(int i=0;i<m;i++){
         mylist.add(sc.next());
      }
      
      Iterator it=func(mylist);
      while(it.hasNext()){
         Object element = it.next();
         System.out.println((String)element);
      }
   }
}

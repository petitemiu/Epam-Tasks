//Solution 1
//We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops.

public boolean makeBricks(int small, int big, int goal) {
  int div = goal/5;
  return div <= big ? goal - div*5 <= small : goal <= big*5 + small;
}


//Solution 2
//Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

public int loneSum(int a, int b, int c) {
  int sum = 0;
  sum += a==b && b==c ? 0 : 
    a!=b && b==c ? a :
      a!=b && a==c ? b : 
        a==b && b!=c ? c :a+b+c;
  return sum;
}


//Solution 3
//Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

public int luckySum(int a, int b, int c) {
  return a==13? 0 :
    b==13 ? a :
      c==13 ? a+b : a+b+c;
}


//Solution 4
//Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

public int luckySum(int a, int b, int c) {
  return a==13? 0 :
    b==13 ? a :
      c==13 ? a+b : a+b+c;
}


//Solution 5
//Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().

public int noTeenSum(int a, int b, int c) {
  return fixTeen(a)+fixTeen(b)+fixTeen(c);
}

public int fixTeen(int n){
  return n>=13 && n<=19 && n!=15 && n!=16 ? 0 : n;
}


//Solution 6
//For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().

public int roundSum(int a, int b, int c) {
  return round10(a)+round10(b)+round10(c);
}

public int round10(int num){
  return num%10<5 ? num-num%10 : num-num%10+10;
}


//Solution 7
//Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.

public boolean closeFar(int a, int b, int c) {
  return Math.abs(a-b)!=Math.abs(a-c) && 
            (Math.abs(a-b)<=1 && Math.abs(b-c)>=2 ||
            Math.abs(a-c)<=1 && Math.abs(c-b)>=2);
}


//Solution 8
//Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.


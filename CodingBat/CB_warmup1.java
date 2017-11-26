//CodingBat Warmup1

//Solution 1
//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
//We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

public boolean sleepIn(boolean weekday, boolean vacation) {
  if (!weekday || vacation)
    return true;
  return false;
}


//Solution 2
//We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
//We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return ((aSmile && bSmile) || (!aSmile && !bSmile));
}


//Solution 3
//Given two int values, return their sum. Unless the two values are the same, then return double their sum.

public int sumDouble(int a, int b) {
  return (a == b ? 4 * a : a + b);
}


//Solution 4
//Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

public int diff21(int n) {
  return (n > 21 ? 2*(n - 21) : 21 - n );
}


//Solution 5
//We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
//We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

public boolean parrotTrouble(boolean talking, int hour) {
  return (talking && ((hour < 7) || (hour > 20)));
}


//Solution 6
//Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

public boolean makes10(int a, int b) {
  return ((a == 10) || (b == 10) || ((a + b) == 10));
}


//Solution 7
//Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

public boolean nearHundred(int n) {
  return ( (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10) );
}


//Solution 8
//Given 2 int values, return true if one is negative and one is positive. 
//Except if the parameter "negative" is true, then return true only if both are negative.

public boolean posNeg(int a, int b, boolean negative) {
  return ( negative && (a < 0) && (b < 0) || 
  !negative && ((a < 0) && (b > 0)|| (a > 0) && (b < 0)));
}


//Solution 9
//Given a string, return a new string where "not " has been added to the front. 
//However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

public String notString(String str) {
  return str.startsWith("not")? str: "not " + str;
}


//Solution 10
//Given a non-empty string and an int n, return a new string where the char at index n has been removed. 
//The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

public String missingChar(String str, int n) {
  return str.substring(0, n) + str.substring(n+1, str.length());
}


//Solution 11
//Given a string, return a new string where the first and last chars have been exchanged.

public String frontBack(String str) {
  int len = str.length();
  if (len > 1){
    char last = str.charAt(len - 1), first = str.charAt(0);
    return last + str.substring(1, len - 1) + first;
  }
  return str;
}


//Solution 12
//Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. 
//Return a new string which is 3 copies of the front.

public String front3(String str) {
  if (!(str.length() > 3)){
    return str + str + str;
  }
  return str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
}


//Solution 13
//Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

public String backAround(String str) {
  char last = str.charAt(str.length() - 1);
  return last + str + last;
}


//Solution 14
//Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod

public boolean or35(int n) {
  return ((n%3 == 0)||(n%5 == 0));
}


//Solution 15
//Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". 
//If the string length is less than 2, use whatever chars are there.

public String front22(String str) {
  if(str.length() < 2){
    return str + str + str;
  }
  String beg = str.substring(0,2);
  return beg + str + beg;
}


//Solution 16
//Given a string, return true if the string starts with "hi" and false otherwise

public boolean startHi(String str) {
  return str.startsWith("hi");
}


//Solution 17
//Given two temperatures, return true if one is less than 0 and the other is greater than 100.

public boolean icyHot(int temp1, int temp2) {
  return ((temp1 > 100) && (temp2 < 0) || (temp2 > 100) && (temp1 < 0));
}


//Solution 18
//Given 2 int values, return true if either of them is in the range 10..20 inclusive.

public boolean in1020(int a, int b) {
  return ((a >= 10) && (a <= 20) || (b >= 10) && (b <= 20));
}


//Solution 19
//We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

public boolean hasTeen(int a, int b, int c) {
  return (a >= 13) && (a <= 19) || (b >= 13) && (b <= 19) || (c >= 13) && (c <= 19);
}


//Solution 20
//We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

public boolean loneTeen(int a, int b) {
  boolean first = (a >= 13) && (a <= 19);
  boolean second = (b >= 13) && (b <= 19);
  return (first!=second);
}


//Solution 21
//Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

public String delDel(String str) {
  return (str.length() > 1) && str.substring(1).startsWith("del")? str.substring(0,1) + str.substring(4): str;
}


//Solution 22
//Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

public boolean mixStart(String str) {
  return (str.length() > 2) && (str.substring(1).startsWith("ix"));
}


//Solution 23
//Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

public String startOz(String str) {
  int len = str.length();
  String out = "";
  if ((len > 0) && (str.charAt(0) == 'o'))
    out += 'o';
  if ((len > 1) && (str.charAt(1) == 'z'))
    out += 'z';
  return out;
}


//Solution 24
//Given three int values, a b c, return the largest

public int intMax(int a, int b, int c) {
  if ((a > b) && (a > c))
    return a;
  if ((b > a) && (b > c))
    return b;
  return c;
}


//Solution 25
//Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

public int close10(int a, int b) {
  return (Math.abs(10 - a) == Math.abs(10 - b))? 0 : ((Math.abs(10 - a) > Math.abs(10 - b))? b : a);
}


//Solution 26
//Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

public boolean in3050(int a, int b) {
  return ((a >= 30) && (a <= 40) && (b >= 30) && (b <= 40) || (a >= 40) && (a <= 50) && (b >= 40) && (b <= 50));
}


//Solution 27
//Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

public int max1020(int a, int b) {
  a = (a >= 10) && (a <= 20)? a : 0;
  b = (b >= 10) && (b <= 20)? b : 0;
  return (a > b)? a : b;
}


//Solution 28
//Return true if the given string contains between 1 and 3 'e' chars.

public boolean stringE(String str) {
  int occurs = str.length() - str.replace("e", "").length();
  return (occurs >= 1) && (occurs <= 3);
}


//Solution 29
//Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

public boolean lastDigit(int a, int b) {
  return (a % 10 == b % 10);
}


//Solution 30
//Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

public String endUp(String str) {
  int len = str.length();
  if (len <= 3)
    return str.toUpperCase();
  return str.substring(0, len - 3) + str.substring(len - 3, len).toUpperCase();
}

//Solution 31
//Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

public String everyNth(String str, int n) {
  int curr = 0, len = str.length();
  String result = str.charAt(0)+"";
  while ((curr + n) < len){
    curr += n;
    result += str.charAt(curr);
  }
  return result;
}



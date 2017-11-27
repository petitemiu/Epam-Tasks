//CodingBat Warmup2


//Solution 1
//Given a string and a non-negative int n, return a larger string that is n copies of the original string.

public String stringTimes(String str, int n) {
  String ret = "";
  for (int i = 0; i < n; ++i)
    ret += str;
  return ret;
}


//Solution 2
//Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever 
//is there if the string is less than length 3. Return n copies of the front;

public String frontTimes(String str, int n) {
  String res = "", part = "";
  if (str.length() <= 3)
    part += str;
  else 
    part += str.substring(0, 3);
  for (int i = 0; i < n; ++i)
    res += part;
  return res;
  
}


//Solution 3
//Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

int countXX(String str) {
  int len = str.length(), count = 0;
  for (int i = 0; i < len - 1; ++i)
    if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x')
      ++count;
  return count;
}

//Solution 4
//Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

boolean doubleX(String str) {
  int len = str.length();
  for(int i = 0; i < len - 1; ++i){
    boolean isX = str.charAt(i) == 'x', nextX = str.charAt(i+1) == 'x';
    if (isX && !nextX)
      break;
    if (isX && nextX)
      return true;
  }
  return false;
}


//Solution 5
//Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

public String stringBits(String str) {
 String ret = "";
 for (int i = 0; i < str.length(); i+=2)
   ret += str.charAt(i);
  return ret;
}


//Solution 6
//Given a non-empty string like "Code" return a string like "CCoCodCode".

public String stringSplosion(String str) {
  String ret = "";
  int len = str.length();
  for (int i = 0; i < len; ++i){
    ret += str.substring(0, i+1);
  }
  return ret;
}


//Solution 7
//Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

public int last2(String str) {
  int len = str.length(), count = 0;
  if (len < 4)
    return 0;
    
  String substr1 = str.substring(len-2, len);
  for(int i = 0; i < len - 2; ++i){
    String substr2 = str.substring(i, i+2);
    if (substr1.equals(substr2))
      ++count;
  }
  return count;
}


//Solution 8
//Given an array of ints, return the number of 9's in the array.

public int arrayCount9(int[] nums) {
  int size = nums.length, count = 0;
  for(int i = 0; i < size; ++i)
    if (nums[i] == 9)
      ++count;
  return count;
}


//Solution 9
//Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.

public boolean arrayFront9(int[] nums) {
  int size = nums.length;
  size = size > 4? 4 : size;
  for (int i = 0; i < size; ++i)
    if (nums[i] == 9)
      return true;
  return false;
}


//Solution 10
//Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

public boolean array123(int[] nums) {
  int size = nums.length;
  if (size < 3)    return false;
  for (int i = 0; i < size - 2; ++i)
    if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3)
      return true;
  return false;
}


//Solution 11
//Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

public int stringMatch(String a, String b) {
  int count = 0, len = a.length() > b.length() ? b.length() : a.length();
  for (int i = 0; i < len - 1; ++i)
    if (a.substring(i, i+2).equals(b.substring(i, i+2)))
      ++count;
  return count;
}


//Solution 12
//Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

public String stringX(String str) {
  int len = str.length();
  String ret = "";
  for (int i = 0; i < len; ++i){
    char curr = str.charAt(i); 
    if (i == 0 || curr != 'x' || i == len - 1)
      ret += curr;
  }
  return ret;
}


//Solution 13
//Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

public String altPairs(String str) {
  String ret = "";
  int len = str.length();
  for (int i = 0; i < len; ++i)
    if (i%4 == 0 || i%4 == 1)
      ret += str.charAt(i);
  return ret;
}


//Solution 14
//Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

public String stringYak(String str) {
  int len = str.length(), i = 0;
  if (len < 3) return str;
  
  String ret = "";
  while (i < len){
    if (i < len - 2 && str.charAt(i) == 'y' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 'k'){
      i += 3;
    }
    else {
      ret += str.charAt(i);
      ++i;
    }
  }
  return ret;
}


//Solution 15
//Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.

public int array667(int[] nums) {
  int count = 0, size = nums.length;
  for (int i = 0; i < size - 1; ++i){
    if (nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7)){
      ++count;
    }
  }
  return count;
}


//Solution 16
//Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.

public boolean noTriples(int[] nums) {
  int size = nums.length;
  for (int i = 0; i < size - 2; ++i){
    if((nums[i] == nums[i+1]) && (nums[i+1] == nums[i+2]))
      return false;
  } 
  return true;
}


//Solution 17
//Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

public boolean has271(int[] nums) {
  int size = nums.length;
  for (int i = 0; i < size - 2; ++i){
    int orig = nums[i];
    if ( (nums[i+1] == orig + 5) && (Math.abs(nums[i+2] - (orig - 1)) <= 2) ){
      return true;
    }
  }
  return false;
}

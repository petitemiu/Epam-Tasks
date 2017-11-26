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
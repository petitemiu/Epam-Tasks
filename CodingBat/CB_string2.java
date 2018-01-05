//Solution 1
//Given a string, return a string where for every char in the original, there are two chars.

public String doubleChar(String str) {
  StringBuilder result = new StringBuilder(str.length()*2);
  for (int i=0; i<str.length(); i++){
    result.append(str.charAt(i)).append(str.charAt(i));
  }
  return result.toString();
}


//Solution 2
//Return the number of times that the string "hi" appears anywhere in the given string.

public int countHi(String str) {
  int result = 0;
  for (int i = 0; i<str.length()-1; i++){
    if(str.substring(i,i+2).equals("hi")){
      result++;
    }
  }
  return result;
}


//Solution 3
//Return true if the string "cat" and "dog" appear the same number of times in the given string.

public boolean catDog(String str) {
  int cat_count = 0;
  int dog_count = 0;
  for (int i = 0; i<str.length()-2; i++){
    if(str.substring(i,i+3).equals("dog")){
      dog_count++;
    }
    if(str.substring(i,i+3).equals("cat")){
      cat_count++;
    }
  }
  return dog_count==cat_count;
}


//Solution 4
//Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

public int countCode(String str) {
  int result = 0;
  for (int i = 0; i<str.length()-3; i++){
    if(java.util.regex.Pattern.matches("co.?e", str.substring(i,i+4))){
      result++;
    }
  }
  return result;
}


//Solution 5
//Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

public boolean endOther(String a, String b) {
  String str = a.length()>b.length() ? a : b;
  String pattern = a.length()>b.length() ? b : a;
  return (str.toLowerCase().endsWith(pattern.toLowerCase()));
}


//Solution 6
//Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.



//Solution 7
//Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

public boolean bobThere(String str) {
  return java.util.regex.Pattern.matches(".*b.{1}b.*", str);
}


//Solution 8
//We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

public boolean xyBalance(String str) {
  return java.util.regex.Pattern.matches("(^.*x+.*y[^x]*$)|(^[^x]*$)", str);
}


//Solution 9
//Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

public String mixString(String a, String b) {
  String longer = a.length() > b.length() ? a : b;
  int longerLen = longer.length();
  String shorter = a.length() < b.length() ? a : b;
  int shorterLen = shorter.length();
  StringBuilder ret = new StringBuilder(longerLen+shorterLen);
  for (int i = 0; i < shorter.length(); ++i){
    ret.append(a.charAt(i)).append(b.charAt(i));
  }
  if (longerLen != shorterLen){
    ret.append(longer.substring(shorterLen));
  }
  return ret.toString();
}


//Solution 10
//Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.

public String repeatEnd(String str, int n) {
  StringBuilder ret = new StringBuilder(n*n);
  for (int i = 0; i < n; ++i){
    ret.append(str.substring(str.length()-n));
  }
  return ret.toString();
}


//Solution 11
//Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

public String repeatFront(String str, int n) {
  StringBuilder ret = new StringBuilder(n*2);
  for (int i = n; i > 0; --i){
    ret.append(str.substring(0,i));
  }
  return ret.toString();
}


//Solution 12
//Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

public String repeatSeparator(String word, String sep, int count) {
  StringBuilder ret = new StringBuilder(count*(word.length()+sep.length()));
  for (int i = 0; i < count; ++i){
    ret.append(word);
    if (i < count-1){
      ret.append(sep);
    }
  }
  return ret.toString();
}


//Solution 13
//Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

public boolean prefixAgain(String str, int n) {
  return str.substring(n).contains(str.substring(0,n));
}


//Solution 14
//Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

public boolean xyzMiddle(String str) {
  if (str.length()<3){
    return false;
  }
  int midStart = (str.length()-3)/2;
  return str.substring(midStart, midStart+3).contains("xyz") || str.length()%2==0 && str.substring(midStart+1, midStart+4).contains("xyz");
  
}


//Solution 15
//A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

public String getSandwich(String str) {
  java.util.regex.Pattern p = java.util.regex.Pattern.compile("bread(.*)?bread");
  java.util.regex.Matcher m = p.matcher(str);
  return m.find() ? m.group(1) : "";
}


//Solution 16
//Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

public boolean sameStarChar(String str) {
  java.util.regex.Pattern p = java.util.regex.Pattern.compile("(.)\\*(?!(\\1|$))");
  java.util.regex.Matcher m = p.matcher(str);
  return !m.find();
}


//Solution 17
//Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

public String oneTwo(String str) {
  StringBuilder ret = new StringBuilder(str.length());
  java.util.regex.Pattern p = java.util.regex.Pattern.compile("(.)(..)");
  java.util.regex.Matcher m = p.matcher(str);
  while(m.find()){
    ret.append(m.group(2)).append(m.group(1));
  }
  return ret.toString();
}


//Solution 18
//Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

public String zipZap(String str) {
  return str.replaceAll("z.p", "zp");
}


//Solution 19
//Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

public String starOut(String str) {
  return str.replaceAll(".?\\*+.?", "");
}


//Solution 20
//Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

public String plusOut(String str, String word) {
  int strLen = str.length();
  int wLen = word.length();
  StringBuilder ret = new StringBuilder(strLen);
  for (int i = 0; i < strLen; ++i){
    if (i > strLen - wLen){
      ret.append("+");
      continue;
    }
    if (str.substring(i, i+wLen).equals(word)){
      ret.append(word);
      i+=wLen-1;
    }
    else{
      ret.append('+');
    }
  }
  return ret.toString();
}


//Solution 21
//Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.


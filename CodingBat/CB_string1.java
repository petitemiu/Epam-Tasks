//Solution 1
//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

public String helloName(String name) {
  return "Hello " + name + "!";
}


//Solution 2
//Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

public String makeAbba(String a, String b) {
  return a + b + b + a; 
}


//Solution 3
//The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

public String makeTags(String tag, String word) {
  return "<" + tag + ">" + word + "</" + tag + ">";
}


//Solution 4
//Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

public String makeOutWord(String out, String word) {
  int mid = out.length() / 2;
  return out.substring(0, mid) + word + out.substring(mid);
}


//Solution 5
//Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

public String extraEnd(String str) {
  int last = str.length() - 2;
  String end = str.substring(last);
  return end+end+end;
}


//Solution 6
//Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

public String firstTwo(String str) {
  int len = str.length();
  if (len <= 2)
    return str;
  return str.substring(0, 2);
}


//Solution 7
//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

public String firstHalf(String str) {
  return str.substring(0, str.length()/2);
}


//Solution 8
//Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

public String withoutEnd(String str) {
  return str.substring(1, str.length()-1);
}


//Solution 9
//Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).

public String comboString(String a, String b) {
  int lenA = a.length(), lenB = b.length();
  String longer = "", shorter = "";
  if (lenA > lenB){
    longer += a;
    shorter += b;
  } 
  else{
    longer += b;
    shorter += a;
  }
  return shorter + longer + shorter;
}


//Solution 10
//Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

public String nonStart(String a, String b) {
  return a.substring(1) + b.substring(1);
}


//Solution 11
//Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

public String left2(String str) {
  return str.substring(2) + str.substring(0,2);
}


//Solution 12
//Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.

public String right2(String str) {
  int lastTwo = str.length()-2;
  return str.substring(lastTwo) + str.substring(0, lastTwo);
}


//Solution 13
//Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.

public String theEnd(String str, boolean front) {
  return front ? "" + str.charAt(0) : "" + str.charAt(str.length()-1);
}


//Solution 14
//Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

public String withouEnd2(String str) {
  int len = str.length();
  if (len <= 2) return "";
  return str.substring(1, len-1);
}


//Solution 15
//Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.

public String middleTwo(String str) {
  int mid = str.length() / 2;
  return "" + str.charAt(mid-1) + str.charAt(mid); 
}


//Solution 16
//Given a string, return true if it ends in "ly".

public boolean endsLy(String str) {
  return (str.length() > 1) && str.substring(str.length()-2).equals("ly");
}


//Solution 17
//Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

public String nTwice(String str, int n) {
  int len = str.length();
  return str.substring(0,n) + str.substring(len - n);
}


//Solution 17
//Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.

public String twoChar(String str, int index) {
  int len = str.length();
  if ((index+2 > len) || (index < 0)) return str.substring(0,2);
  return str.substring(index, index+2);
}


//Solution 18
//Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.

public String middleThree(String str) {
  int mid = str.length()/2;
  return str.substring(mid-1, mid+2);
}


//Solution 19
//Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.

public boolean hasBad(String str) {
  return (str.length() >= 3 &&  str.substring(0,3).equals("bad") || 
  str.length() >= 4 && str.substring(1,4).equals("bad")); 
}


//Solution 20
//Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.

public String atFirst(String str) {
  int len = str.length();
  if (len == 0) return "@@";
  if (len == 1) return "" + str.charAt(0) + '@';
  return str.substring(0,2);
}


//Solution 21
//Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

public String lastChars(String a, String b) {
  String ret = "";
  if  (a.length() > 0) ret+=a.charAt(0);
  else ret += "@";
  
  if (b.length() > 0) ret+=b.charAt(b.length()-1);
  else ret += "@";
  return ret;
}


//Solution 22
//Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

public String conCat(String a, String b) {
  String ret = "";
  int lenA = a.length(), lenB = b.length();
  if (lenA == 0 || lenB == 0 || a.charAt(lenA-1) != b.charAt(0)) ret += a;
  else ret+= a.substring(0, lenA-1);
  ret+=b;
  return ret;
}


//Solution 23
//Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".

public String lastTwo(String str) {
  int len = str.length();
  if (len < 2) return str;
  return str.substring(0, len-2) + str.charAt(len-1) + str.charAt(len-2);
}


//Solution 24
//Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

public String seeColor(String str) {
  int len = str.length();
  if (len < 3) return "";
  if (str.substring(0,3).equals("red")) return "red";
  if (len > 3 && str.substring(0,4).equals("blue")) return "blue";
  return "";
}


//Solution 25
//Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

public boolean frontAgain(String str) {
  int len = str.length();
  return (len >= 2 && str.substring(0,2).equals(str.substring(len-2,len)));
}


//Solution 26
//Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

public String minCat(String a, String b) {
  int lenA = a.length(), lenB = b.length(), len = 0;
  len = lenA > lenB ? lenB : lenA;
  return a.substring(lenA-len,lenA) + b.substring(lenB-len,lenB);
}


//Solution 27
//Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

public String minCat(String a, String b) {
  int lenA = a.length(), lenB = b.length(), len = 0;
  len = lenA > lenB ? lenB : lenA;
  return a.substring(lenA-len,lenA) + b.substring(lenB-len,lenB);
}


//Solution 28
//Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.

public String extraFront(String str) {
  if (str.length() < 2) return str + str + str;
  
  return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
}


//Solution 29
//Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.

public String without2(String str) {
  int len = str.length();
  if (len == 2) return "";
  if (len > 2 && str.substring(0,2).equals(str.substring(len-2,len))) return str.substring(2,len);
  return str;
}


//Solution 30
//Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

public String deFront(String str) {    
  int len = str.length();
  
  if (len == 0) return "";
  
  String ret = "";
  
  if (len >= 1 && str.charAt(0) == 'a') ret += 'a';
  if (len >= 2 && str.charAt(1) == 'b') ret += 'b';
  if (len >= 3) ret+= str.substring(2);
  
  return ret;
}


//Solution 31
//Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.

public String startWord(String str, String word) {
  int strLen = str.length(), wordLen = word.length();
  if (strLen < wordLen) return "";
  String ret = "";
  
  ret += str.charAt(0);
  ret = str.substring(1,wordLen).equals(word.substring(1, wordLen)) ? 
    ret+word.substring(1, wordLen) : "";
    
  return ret;
}


//Solution 32
//Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

public String withoutX(String str) {
  if (str.length() == 0) return "";
  String ret = str.charAt(0) == 'x' ? str.substring(1) : str;
  ret = ret.length() > 0 && ret.charAt(ret.length()-1) == 'x' ? ret.substring(0, ret.length()-1) : ret;
  return ret;
}


//Solution 33
//Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.

public String withoutX2(String str) {
  int len = str.length();
  if (len >= 2 && str.charAt(0) == 'x' && str.charAt(1) == 'x') return str.substring(2);
  if (len >= 1 && str.charAt(0) == 'x') return str.substring(1);
  if (len > 2 && str.charAt(1) == 'x') return "" +  str.charAt(0) + str.substring(2);
  return str;
}

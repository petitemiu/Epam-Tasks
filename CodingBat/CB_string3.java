//Solution 1
//Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

public int countYZ(String str) {
  int count = 0;
  String[] words = str.split("[^A-Za-z]");
  for (int i = 0; i < words.length; ++i){
    if (words[i].matches(".*[zyZY]$")){
      ++count;
    }
  }
  return count;
}


//Solution 2
//Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

public String withoutString(String base, String remove) {
  return base.replaceAll("(?i)"+remove, "");
}


//Solution 3
//Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

public boolean equalIsNot(String str) {
  return occurs(str, "is")==occurs(str, "not");
}

public int occurs(String str, String word){
  int strLen = str.length();
  int wLen = word.length();
  int count = 0;
  for (int i = 0; i < strLen-wLen+1; ++i){
    if (str.substring(i, i+wLen).equals(word)){
      count++;
    }
  }
  return count;
}


//Solution 4
//We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.

public boolean gHappy(String str) {
  return str.matches("([^g]*gg+[^g]*)*");
}


//Solution 5
//We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.

public int countTriple(String str) {
  java.util.regex.Pattern p = java.util.regex.Pattern.compile("(.)(?=\\1\\1)");
  java.util.regex.Matcher m = p.matcher(str);
  int count = 0;
  while (m.find()){
    ++count;
  }
  return count;
}


//Solution 6
//Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

public int sumDigits(String str) {
  int sum = 0;
  for (int i = 0; i < str.length(); ++i){
    if (Character.isDigit(str.charAt(i))){
      sum += Integer.parseInt(str.substring(i,i+1));
    }
  }
  return sum;
}


//Solution 7
//Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".

public String sameEnds(String str) {
	int len = str.length();
	int med = len%2 == 0 ? len/2 : len/2+1;
	int lastBeg = len%2 == 0 ? med : med-1;
    for (int i = 0; i < med; i++){
        String beg = str.substring(0, lastBeg-i);
        String end = str.substring(med+i, len);
        if (beg.equals(end)){
            return beg;
        }
    }
    return "";
}


//Solution 8
//Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

public String mirrorEnds(String str) {
	int len = str.length();
	int count = 0;
	for (int i = 0; i < len; i++) {
        if (str.charAt(i)!=str.charAt(len-i-1)){
            break;
        }
        ++count;
    }
    return str.substring(0,count);
}


//Solution 9 
//Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

public int maxBlock(String str) {
	int len = str.length();
    int count = 0;
    for (int i = 0; i < len; i++) {
        int currCount = 0;
        for (int j = i; j < len; j++) {
            if (str.charAt(i)==str.charAt(j)){
                currCount++;
            }
            else break;
        }
        if (currCount > count){
            count = currCount;
        }
    }
    return count;
}


//Solution 10
//Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

public int sumNumbers(String str) {
  int sum = 0;
  java.util.regex.Pattern p = java.util.regex.Pattern.compile("([0-9]+)");
  java.util.regex.Matcher m = p.matcher(str);
  while (m.find()){
    sum += Integer.parseInt(m.group(1));
  }
  return sum;
}


//Solution 11
//Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)

public String notReplace(String str) {
  return str.replaceAll("(?<![a-zA-Z])is(?![a-zA-Z])", "is not");
}
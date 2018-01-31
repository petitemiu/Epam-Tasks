//Solution 1
//Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later, but for this problem the value is simply 0.

public Map<String, Integer> word0(String[] strings) {
  Map<String, Integer> ret = new HashMap<>(strings.length);
  for(String str : strings){
    ret.put(str, 0);
  }
  return ret;
}


//Solution 2
//Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.

public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> map = new HashMap(strings.length);
  for(String current : strings){
    map.put(current, current.length());
  }
  return map;
}


//Solution 3
//Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.

public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap(strings.length);
  for(String current : strings){
    map.put(current.substring(0,1), current.substring(current.length()-1));
  }
  return map;
}


//Solution 4
//The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.

public Map<String, Integer> wordCount(String[] strings) {
  Arrays.sort(strings);
  Map<String, Integer> map = new HashMap(strings.length);
  int count = 1;
  for(int i = 0; i < strings.length; ++i){
    if(i==strings.length-1){
      map.put(strings[i], count);
    }
    else if(strings[i] == strings[i+1]){
      ++count;
      continue;
    }
    else{
      map.put(strings[i], count);
      count = 1;
    }
  }
  return map;
}


//Solution 5
//Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.

public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap();
  for(String str : strings){
    String inMap = map.get(str.substring(0, 1));
    String firstSym = str.substring(0, 1);
    if(inMap != null){
      map.put(firstSym, inMap+str);
    }
    else{
      map.put(firstSym, str);
    }
  }
  return map;
}


//Solution 6
//Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.

public String wordAppend(String[] strings) {
  StringBuilder res = new StringBuilder();
  Map<String, Integer> map = new HashMap(strings.length);
  for(String str : strings){
    Integer value = map.get(str);
    if(value != null){
      map.put(str, ++value);
      if(value%2==0){
        res.append(str);
      }
    }
    else{
      map.put(str, 1);
    }
  }
  return res.toString();
}


//Solution 7
//Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.

public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> map = new HashMap();
  for(String str : strings){
    Boolean value = map.get(str);
    if(value != null){
      map.put(str, true);
    }
    else{
      map.put(str, false);
    }
  }
  return map;
}


//Solution 8
//We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map, this can be solved making just one pass over the array. More difficult than it looks.

public String[] allSwap(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for(int i = 0; i < strings.length; ++i){
    String firstSym = strings[i].substring(0, 1);
    Integer index = map.get(firstSym);
    if(index == null){
      map.put(firstSym, i);
    }
    else{
      String tmp = strings[i];
      strings[i] = strings[index];
      strings[index] = tmp;
      map.remove(firstSym);
    }
  }
  return strings;
}


//Solution 9
//We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult than it looks.

public String[] firstSwap(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for(int i = 0; i < strings.length; ++i){
    String firstSym = strings[i].substring(0, 1);
    Integer index = map.get(firstSym);
    if(index == null){
      map.put(firstSym, i);
    }
    else if(index != -1){
      String tmp = strings[i];
      strings[i] = strings[index];
      strings[index] = tmp;
      map.put(firstSym, -1);
    }
  }
  return strings;
}
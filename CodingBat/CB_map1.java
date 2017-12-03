//http://codingbat.com/java/Map-1

//Solution 1
//Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.

public Map<String, String> mapBully(Map<String, String> map) {
  if (map.get("a") != null && !map.get("a").equals("")){
    map.put("b", map.get("a"));
    map.put("a", "");
  }
  return map;
}


//Solution 2
//Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.

public Map<String, String> mapShare(Map<String, String> map) {
  map.remove("c");
  if (map.get("a") != null && !map.get("a").equals("")){
    map.put("b", map.get("a"));
  }
  return map;
}

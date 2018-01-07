//Solution 1
//Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

public int countEvens(int[] nums) {
  int count = 0;
  for (int num : nums){
    if (num%2==0){
      count++;
    }
  }
  return count;
}

//Solution 2
//Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

public int bigDiff(int[] nums) {
  int min = nums[0];
  int max = nums[0];
  for (int num : nums){
    if (min > num){
      min = num;
    }
    if (max < num){
      max = num;
    }
  }
  return max - min;
}


//Solution 3
//Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.

public int centeredAverage(int[] nums) {
  int sum = 0;
  int min = nums[0];
  int max = nums[0];
  for (int num : nums){
    if (min > num){
      min = num;
    }
    if (max < num){
      max = num;
    }
    sum +=num;
  }
  sum -= min+max;
  return sum/(nums.length-2);
}


//Solution 4
//Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

public int sum13(int[] nums) {
  int sum = 0;
  for (int i = 0; i < nums.length; i++){
    if (nums[i] == 13){
      i++;
    }
    else{
      sum += nums[i];
    }
  }
  return sum;
}


//Solution 5
//Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

public int sum67(int[] nums) {
  int sum = 0;
  boolean doSum = true;
  for (int i = 0; i < nums.length; ++i){
    
    if (nums[i]==6){
      doSum = false;
    }
    
    sum += doSum ? nums[i] : 0;
    
    if (nums[i]==7){
      doSum = true;
    }
  }
  return sum;
}


//Solution 6
//Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

public boolean has22(int[] nums) {
  for (int i = 0; i < nums.length-1; i++){
    if(nums[i]==2 && nums[i+1]==2){
      return true;
    }
  }
  return false;
}


//Solution 7
//Given an array of ints, return true if the array contains no 1's and no 3's.

public boolean lucky13(int[] nums) {
  for (int i = 0; i < nums.length; i++){
    if(nums[i]==1 || nums[i]==3){
      return false;
    }
  }
  return true;
}


//Solution 8
//Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

public boolean sum28(int[] nums) {
  int sum = 0;
  for (int i = 0; i < nums.length; i++){
    if(nums[i]==2){
      sum+=nums[i];
    }
  }
  return sum==8;
}


//Solution 9
//Given an array of ints, return true if the number of 1's is greater than the number of 4's

public boolean more14(int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length; ++i){
    if (nums[i]==1){
      ++count;
    }
    if(nums[i]==4){
      --count;
    }
  }
  return count > 0;
}


//Solution 10
//Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. The syntax to make a new int array is: new int[desired_length] 

public int[] fizzArray(int n) {
  int[] ret = new int[n];
  for(int i = 0; i < n; ++i){
    ret[i] = i;
  }
  return ret;
}


//Solution 11
//Given an array of ints, return true if every element is a 1 or a 4.

public boolean only14(int[] nums) {
  for (int i = 0; i < nums.length; i++){
    if(nums[i]!=1 && nums[i]!=4){
      return false;
    }
  }
  return true;
}


//Solution 12
//Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types. The syntax to make a new string array is: new String[desired_length] 

public String[] fizzArray2(int n) {
  String[] ret = new String[n];
  for(int i = 0; i < n; ++i){
    ret[i] = String.valueOf(i);
  }
  return ret;
}


//Solution 13
//Given an array of ints, return true if it contains no 1's or it contains no 4's.

public boolean no14(int[] nums) {
  boolean has4 = false;
  boolean has1 = false;
  for (int i = 0; i < nums.length; i++){
    if(nums[i]==1){
      has1 = true;
    }
    if (nums[i]==4){
      has4 = true;
    }
  }
  return !has1 || !has4;
}


//Solution 14
//We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.

public boolean isEverywhere(int[] nums, int val) {
  for (int i = 0; i < nums.length-1; i++){
    if (nums[i]!=val && nums[i+1] != val){
      return false;
    }
  }
  return true;
}


//Solution 15
//Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

public boolean either24(int[] nums) {
  boolean has22 = false;
  boolean has44 = false;
  for (int i = 0; i < nums.length-1; i++){
    if (nums[i]==2 && nums[i+1]==2){
      has22 = true;
    }
    if (nums[i]==4 && nums[i+1]==4){
      has44 = true;
    }
  }
  return has22^has44;
}


//Solution 16
//Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.

public int matchUp(int[] nums1, int[] nums2) {
  int count = 0;
  for(int i = 0; i < nums1.length; ++i){
    int diff = Math.abs(nums1[i]-nums2[i]);
    if(diff <= 2 && diff != 0){
      ++count;
    }
  }
  return count;
}


//Solution 17
//Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.

public boolean has77(int[] nums) {
  for (int i = 0; i < nums.length-1; i++){
    if (nums[i]==7 && (nums[i+1]==7 || (i+2<nums.length && nums[i+2]==7))){
      return true;
    }
  }
  return false;
}


//Solution 18
//Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

public boolean has12(int[] nums) {
  boolean has1 = false;
  for (int i = 0; i < nums.length; i++){
    if (nums[i]==1){
      has1 = true;
    }
    if (has1 && nums[i]==2){
      return true;
    }
  }
  return false;
}


//Solution 19
//Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

public boolean modThree(int[] nums) {
  for (int i = 0; i < nums.length-2; i++){
    if (nums[i]%2==nums[i+1]%2 && nums[i+1]%2==nums[i+2]%2){
      return true;
    }
  }
  return false;
}


//Solution 20
//Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

public boolean haveThree(int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length; i++){
    if (nums[i]==3){
      if (i+1<nums.length && nums[i+1]==3){
        return false;
      }
      ++count;
    }
  }
  return count==3;
}


//Solution 21
//Given an array of ints, return true if every 2 that appears in the array is next to another 2.

public boolean twoTwo(int[] nums) {
  for (int i = 0; i < nums.length; i++){
    if (nums[i]==2 && !(i>0 && nums[i-1]==2 || i<nums.length-1 && nums[i+1]==2)){
      return false;
    }
  }
  return true;
}


//Solution 22
//Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.

public boolean sameEnds(int[] nums, int len) {
  for (int i = 0; i < len; i++){
    if (nums[i]!=nums[nums.length-len+i]){
      return false;
    }
  }
  return true;
}


//Solution 23
//Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

public boolean tripleUp(int[] nums) {
  for (int i = 0; i < nums.length-2; i++){
    if(nums[i] == nums[i+1]-1 && nums[i+1] == nums[i+2]-1){
      return true;
    }
  }
  return false;
}


//Solution 24
//Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number. Note that a length-0 array is valid.

public int[] fizzArray3(int start, int end) {
  int[] nums = new int[end-start];
  for (int i = 0; i < nums.length; i++){
    nums[i] = start+i;
  }
  return nums;
}


//Solution 25
//Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.

public int[] shiftLeft(int[] nums) {
  if (nums.length == 0){
    return nums;
  }
  int tmp = nums[0];
  for (int i = 0; i < nums.length-1; i++){
    nums[i] = nums[i+1];
  }
  nums[nums.length-1] = tmp;
  return nums;
}


//Solution 26
//For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

public int[] tenRun(int[] nums) {
  int value = 0;
  boolean setValue = false;
  for (int i = 0; i < nums.length; i++){
    if (nums[i]%10==0){
      setValue = true;
      value = nums[i];
    }
    else{
      if (setValue){
        nums[i] = value;
      }
    }
  }
  return nums;
}


//Solution 27
//Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

public int[] pre4(int[] nums) {
  int index = 0;
  for (int i = 0; i < nums.length; i++){
    if (nums[i] == 4){
      break;
    }
    index++;
  }
  return Arrays.copyOf(nums, index);
}


//Solution 28
//Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

public int[] post4(int[] nums) {
  int index = 0;
  for (int i = 0; i < nums.length; i++){
    if (nums[i] == 4){
      index = i;
    }
  }
  return Arrays.copyOfRange(nums, index+1, nums.length);
}


//Solution 29
//We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.

public int[] notAlone(int[] nums, int val) {
  for (int i = 1; i < nums.length-1; i++){
    if (nums[i]==val && !(nums[i-1]==val || nums[i+1]==val)){
      int left = nums[i-1];
      int right = nums[i+1];
      nums[i] = left > right ? left : right; 
    }
  }
  return nums;
}


//Solution 30
//Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.

public int[] zeroFront(int[] nums) {
  int nextZeroIndex = 0;
  for (int i = 0; i < nums.length; i++){
    if (nums[i] == 0){
      nums[i] = nums[nextZeroIndex];
      nums[nextZeroIndex] = 0;
      ++nextZeroIndex;
    }
  }
  return nums;
}


//Solution 31
//Return a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.

public int[] withoutTen(int[] nums) {
  int[] newNums = new int[nums.length];
  int j = 0;
  for (int i = 0; i < nums.length; ++i){
    if (nums[i] != 10){
      newNums[j] = nums[i];
      ++j;
    }
  }
  for (int i = j; j < nums.length; ++j){
    newNums[i] = 0;
  }
  return newNums;
}


//Solution 32
//Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.

public int[] zeroMax(int[] nums) {
  for (int i = 0; i < nums.length; ++i){
    if (nums[i]==0){
      for (int j = i; j < nums.length; ++j){
        nums[i] = nums[j]%2==1 && nums[j] > nums[i] ? nums[j] : nums[i];
      }
    }
  }
  return nums;
}


//Solution 33
//Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.

public int[] evenOdd(int[] nums) {
  int[] newNums = new int[nums.length];
  int evenIndex = 0;
  int oddIndex = nums.length-1;
  for (int i = 0; i < nums.length; ++i){
    if (nums[i]%2==0){
      newNums[evenIndex]=nums[i];
      ++evenIndex;
    }
    
    if (nums[i]%2==1){
      newNums[oddIndex]=nums[i];
      --oddIndex;
    }
  }
  return newNums;
}


//Solution 34
//This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for job interviews. (See also: FizzBuzz Code.) Consider the series of numbers beginning at start and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers, except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int or other type. This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.

public String[] fizzBuzz(int start, int end) {
  String[] ret = new String[end-start];
  for (int i = start; i < end; ++i){
    ret[i-start] = i%3==0 && i%5==0 ? "FizzBuzz" :
      i%3==0 ? "Fizz" : 
      i%5==0 ? "Buzz" : String.valueOf(i);
  }
  return ret;
}
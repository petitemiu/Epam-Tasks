//Solution 1
//Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)

public int maxSpan(int[] nums) {
  int[] spans = new int[nums.length];
  int max =0;
  for (int i = 0; i < nums.length; ++i){
    if (spans[i] == 0){
      int span = 0;
      for (int j = nums.length-1; j >= i; --j){
        if (nums[i]==nums[j]){
          if (span==0){
            span = j-i+1;
          }
          spans[j] = span;
        }
      }
      max = span > max ? span : max;
    }
  }
  return max;
}


//Solution 2
//Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.

public int[] fix34(int[] nums) {
  int[] newNums = new int[nums.length];
  int[] otherValues = new int[nums.length];

  int j = 0;
  for (int i = 0; i < nums.length; ++i){
    if(nums[i] == 3){
      newNums[i] = 3;
      newNums[i+1] = 4;
    }
    else if (nums[i] != 4) {
      otherValues[j] = nums[i];
      ++j;
    }
  }
  
  j = 0;
  for (int i = 0; i < newNums.length; ++i){
    if (newNums[i] != 3 && newNums[i] != 4){
      newNums[i] = otherValues[j];
      ++j;
    }
  }
  return newNums;
}


//Solution 3
//(This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.

public int[] fix45(int[] nums) {
  int[] newNums = new int[nums.length];
  int[] otherValues = new int[nums.length];

  int j = 0;
  for (int i = 0; i < nums.length; ++i){
    if(nums[i] == 4){
      newNums[i] = 4;
      newNums[i+1] = 5;
    }
    else if (nums[i] != 5) {
      otherValues[j] = nums[i];
      ++j;
    }
  }
  
  j = 0;
  for (int i = 0; i < newNums.length; ++i){
    if (newNums[i] != 5 && newNums[i] != 4){
      newNums[i] = otherValues[j];
      ++j;
    }
  }
  return newNums;
}


//Solution 4
//Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

public boolean canBalance(int[] nums) {
  int sumLeft = 0;
  int sumRight = 0;
  for (int i = 0; i < nums.length; ++i){
    for (int j = 0; j < i; ++j){
      sumLeft += nums[j];
    }
    for (int j = i; j < nums.length; ++j){
      sumRight += nums[j];
    }
    if (sumLeft==sumRight) return true;
    sumRight = 0;
    sumLeft = 0;
  }
  return false;
}


//Solution 5
//Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

public boolean linearIn(int[] outer, int[] inner) {
  int fulfilledConditions = 0;
  int j = 0;
  for (int i = 0; i < outer.length; ++i){
    if (j < inner.length && outer[i] == inner[j]){
      ++fulfilledConditions;
      ++j;
    }
    if (fulfilledConditions == inner.length){
      return true;
    }
  }
  return false;
}


//Solution 6
//Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

public int[] squareUp(int n) {
  if (n==0){
    return new int[]{};
  }
  
  int[] arr = new int[n*n];
  boolean[] enabledPositions = new boolean[n];
  int lastEnabled = n-1;
  enabledPositions[lastEnabled] = true;
  
  for (int i = 0; i < n; ++i){
    for (int j = 0; j < n; ++j){
      if (enabledPositions[j]){
        arr[i*n+j] = n-j;
      }
    }
    if (lastEnabled > 0){
      enabledPositions[--lastEnabled] = true;
    }
  }
  return arr;
}


//Solution 7
//Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.


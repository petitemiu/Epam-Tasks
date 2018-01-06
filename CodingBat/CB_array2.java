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


//Solution 1
//Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.

public boolean scoresIncreasing(int[] scores) {
  boolean result = true;
  for (int i = 1; i<scores.length; ++i){
    if (scores[i]<scores[i-1]){
      result = false;
      break;
    }
  }
  return result;
}


//Solution 2
//Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.

public boolean scores100(int[] scores) {
  boolean result = false;
  for (int i = 1; i<scores.length; ++i){
    if (scores[i]==scores[i-1] && scores[i] == 100){
      result = true;
      break;
    }
  }
  return result;
}


//Solution 3
//Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.

public boolean scoresClump(int[] scores) {
  for (int i = 0; i < scores.length-2; ++i){
    if (scores[i+1]-scores[i]<=2 && 
        scores[i+2]-scores[i]<=2){
      return true;
    }
  }
  return false;
}


//Solution 4
//Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger. We'll say that the second half begins at index length/2. The array length will be at least 2. To practice decomposition, write a separate helper method 
// __int average(int[] scores, int start, int end)__ { which computes the average of the elements between indexes start..end. Call your helper method twice to implement scoresAverage(). Write your helper method after your scoresAverage() method in the JavaBat text area. Normally you would compute averages with doubles, but here we use ints so the expected results are exact.



public int scoresAverage(int[] scores) {
  int avg1 = average(scores, 0, scores.length/2-1);
  int avg2 = average(scores, scores.length/2, scores.length-1);
  return avg1 > avg2 ? avg1 : avg2;
}

int average(int[] scores, int start, int end){
  int sum = 0;
  for (int i = start; i <= end; ++i){
    sum += scores[i];
  }
  return sum/(end-start+1);
}
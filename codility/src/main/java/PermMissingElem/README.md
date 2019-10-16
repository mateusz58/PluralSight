An array HashCodeWorking consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] HashCodeWorking); }

that, given an array HashCodeWorking, returns the value of the missing element.

For example, given array HashCodeWorking such that:

  HashCodeWorking[0] = 2
  HashCodeWorking[1] = 3
  HashCodeWorking[2] = 1
  HashCodeWorking[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of HashCodeWorking are all distinct;
each element of array HashCodeWorking is an integer within the range [1..(N + 1)].
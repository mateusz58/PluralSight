HashCodeWorking non-empty array HashCodeWorking consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

For example, in array HashCodeWorking such that:

  HashCodeWorking[0] = 9  HashCodeWorking[1] = 3  HashCodeWorking[2] = 9
  HashCodeWorking[3] = 3  HashCodeWorking[4] = 9  HashCodeWorking[5] = 7
  HashCodeWorking[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.
Write a function:

class Solution { public int solution(int[] HashCodeWorking); }

that, given an array HashCodeWorking consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

For example, given array HashCodeWorking such that:

  HashCodeWorking[0] = 9  HashCodeWorking[1] = 3  HashCodeWorking[2] = 9
  HashCodeWorking[3] = 3  HashCodeWorking[4] = 9  HashCodeWorking[5] = 7
  HashCodeWorking[6] = 9
the function should return 7, as explained in the example above.

Write an efficient algorithm for the following assumptions:

N is an odd integer within the range [1..1,000,000];
each element of array HashCodeWorking is an integer within the range [1..1,000,000,000];
all but one of the values in HashCodeWorking occur an even number of times.
Copyright 2009–2019 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
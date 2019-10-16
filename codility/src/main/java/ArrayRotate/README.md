
An array HashCodeWorking consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array HashCodeWorking = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

The goal is to rotate array HashCodeWorking K times; that is, each element of HashCodeWorking will be shifted to the right K times.

Write a function:

class Solution { public int[] solution(int[] HashCodeWorking, int K); }

that, given an array HashCodeWorking consisting of N integers and an integer K, returns the array HashCodeWorking rotated K times.

For example, given

    HashCodeWorking = [3, 8, 9, 7, 6]
    K = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:

    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
For another example, given

    HashCodeWorking = [0, 0, 0]
    K = 1
the function should return [0, 0, 0]

Given

    HashCodeWorking = [1, 2, 3, 4]
    K = 4
the function should return [1, 2, 3, 4]

Assume that:

N and K are integers within the range [0..100];
each element of array HashCodeWorking is an integer within the range [−1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.


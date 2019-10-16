package OddArray;

// you can also use imports, for example:
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.HashSet;

class Solution {


	public int solution(int[] A) {
		// write your code in Java SE 8
		int result;
		int numberofPair=0;
		HashSet<Integer>list=new HashSet<>();

		for(int i=0;i<A.length-1;i++)
		{

			for(int j=i+1;j<A.length;j++ )
			{
				if(list.contains(A[i]))
				{
					numberofPair=1;
					break;
				}
				if(A[j]==A[i])
				{
					numberofPair++;

				}
			}
			list.add(A[i]);
			if(numberofPair%2==0)
			{
				return A[i];
			}
			numberofPair=0;
		}
		return 0;

	}
}


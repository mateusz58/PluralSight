package ArrayRotate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

	Solution a;
	@BeforeEach
	void init()
	{
		a=new Solution();
	}

	@Test
	void checkIfArrayRotate() {
		a.solution(new int[]{1,2,3,4,5,6},0);
	}
}
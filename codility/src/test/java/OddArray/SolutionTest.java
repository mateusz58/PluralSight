package OddArray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

	Solution a;
	@BeforeEach
	void setUp() {
		a=new Solution();
	}

	@Test
	void solution() {

		assertEquals(7,a.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
	}
}
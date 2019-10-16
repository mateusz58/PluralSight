package FrogJmp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SolutionTest {
	Solution a;

	@BeforeEach
	public void init()
	{

		a=new Solution();
	}

	@ParameterizedTest
	@ValueSource(ints={1,2})
	void solution() {
		assertEquals( 3,a.solution(10,85,30));
	}
}
package BinaryGap;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

	public  Solution a;

	@BeforeEach
	public  void init()
	{
		a=new Solution();
	}

	@Test
	void ShouldReturnTrueverifyBinary() {

		assertEquals(true,a.verifyBinary("1001"));
		assertEquals(true,a.verifyBinary("1001000000000011"));
	}
	@Test
	void ShouldReturnFalseverifyBinary() {

		assertEquals(false,a.verifyBinary("a10001"));
		assertEquals(false,a.verifyBinary("dfsdfsdf"));
		assertEquals(false,a.verifyBinary("    "));
		assertEquals(false,a.verifyBinary("1000   "));
	}

	@Test
	void ShouldconvertBinaryToNumber() {
		assertEquals(9,a.convertBinaryToNumber("1001"));
		assertEquals(0,a.convertBinaryToNumber("00000"));
		assertEquals(1,a.convertBinaryToNumber("1"));
		assertEquals(8,a.convertBinaryToNumber("1000"));
		assertEquals(8,a.convertBinaryToNumber("1001010001"));

	}

	@Test
	void ShouldconvertNumberToBinary() {

		assertEquals("1001",a.convertNumberToBinary(9));
		assertEquals("10010",a.convertNumberToBinary(18));
		assertEquals("1111",a.convertNumberToBinary(15));

	}

	@Test
	void calculateLongestBinaryGaps() {

		assertEquals(2,a.calculateLongestBinaryGaps(9)); /// binary 1001
		assertEquals(2,a.calculateLongestBinaryGaps(18)); /// binary 10010
		assertEquals(0,a.calculateLongestBinaryGaps(8)); /// binary 1000
		assertEquals(6,a.calculateLongestBinaryGaps(129)); /// binary 10000001
		assertEquals(6,a.calculateLongestBinaryGaps(129)); /// binary 10000001
		assertEquals(0,a.calculateLongestBinaryGaps(1)); /// binary 001
		assertEquals(3,a.calculateLongestBinaryGaps(1001010001)); /// binary 001

	}
}
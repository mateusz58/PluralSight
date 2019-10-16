package BinaryGap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {


	private final Pattern binaryPattern = Pattern.compile("[0-1]+");

	public Solution() {
	}

	public boolean verifyBinary(String binary) {
		Matcher matcher = binaryPattern.matcher(binary);
		return matcher.matches();
	}

	public int convertBinaryToNumber(String input) {
		if (verifyBinary(input)) {
			char[] array = new char[input.length()];
			array = input.toCharArray();
			int sum = 0;
			for (int i = 0; i < input.length(); i++) {
				if (array[i] == '1') {
					int wyk = (input.length() - 1) - i;
					sum = (int) (sum + Math.pow(2, wyk));
				}

			}
			return sum;
		}
		return 0;
	}

	public String convertNumberToBinary(int number) {
		StringBuilder sb = new StringBuilder();

		if (number == 0) {
			return "0";
		}
		while (number >= 1) {
			sb.append(number % 2);
			number = number / 2;
		}

		return sb.reverse().toString();

	}

	public int calculateLongestBinaryGaps(int number) {
		String binary = convertNumberToBinary(number);
		char[] arr = binary.toCharArray();
		if (arr.length < 3) {
			return 0;
		}
		int count = 0;
		int max = 0;
		boolean mark = false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == '1' && arr[i + 1] == '0') {
				int j = i + 1;
				for (; j < arr.length - 1; j++) {
					count++;
					if (max < count) {
						max = count;
					}
					if (arr[j + 1] == '1') {
						mark = true;
						count = 0;
						break;
					}
				}


			} else {
				count = 0;
			}
		}
		if (mark == false) {
			return 0;
		}
		return max;
	}
}

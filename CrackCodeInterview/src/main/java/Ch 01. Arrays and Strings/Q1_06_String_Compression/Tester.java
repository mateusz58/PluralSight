package Q1_06_String_Compression;

public class Tester {

	public static void main(String[] args) {
		String str = "aaaaabbbbaaaabbddc";
		System.out.println(str);
		System.out.println(Q1_06_String_Compression.QuestionA.compressBad(str));
		System.out.println(Q1_06_String_Compression.QuestionB.compress(str));
		System.out.println(Q1_06_String_Compression.QuestionC.compress(str));
	}

}

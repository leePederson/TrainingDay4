package Day4;
import java.io.*;

public class Strings {
	public static void main(String[] args) {
		String test;
		test = "Hello World!";
		System.out.println(test);
		System.out.println(test.concat(" It's me!"));
		StringBuffer buffTest = new StringBuffer("StringBuffer");
		System.out.println(buffTest.append(" works with other strings"));
		buffTest.insert(0, "Lee's ");
		System.out.println(buffTest);
		StringBuilder buildTest = new StringBuilder("StringBuilder");
		System.out.println(buildTest);
		buildTest.replace(0,6,  "Bob the ");
		int strLen = buildTest.length();
		buildTest.insert(strLen," builds strings");
		System.out.println(buildTest);
		
	}
}

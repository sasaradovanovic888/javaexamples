package development;

public class AsciiReport {
	void reportAllAscii(int asciiValue) {
		System.out.println("ASCII char[" + asciiValue + "] = " + (char)asciiValue);
	}
	
	void delimiterLine() {
		
		char delimiterChar = '-';
		int sizeOfString = 30;
		String lineEnd = "\n";
		
		for (int i = 0; i < sizeOfString; i++) {
			System.out.print(delimiterChar);	
		}
		System.out.print(lineEnd);
	}
}

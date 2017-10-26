package development;

public class ExperimentalASCII {
	
	public static void main(String[] args) {
		
		int ascii = (int) Math.pow(2,7);
		
		AsciiReport ar = new AsciiReport();
		
		for (int i = 0; i < ascii; i++) {
			ar.reportAllAscii(i);
		}
		
		ar.delimiterLine();
		
		int ascii8 = (int) Math.pow(2, 8);
		
		for (int i = 0; i < ascii8; i++) {
			ar.reportAllAscii(i);
		}
		
		ar.delimiterLine();
		
		int asciiStart = 32;
		int asciiEnd = 128;
		
		for (int i = asciiStart; i < asciiEnd; i++) {
			ar.reportAllAscii(i);
		}
	}
}

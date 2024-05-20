package chap24_dataio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class _10_PrintStream {

	public static void main(String[] args) {
		try {
			PrintWriter printWriter = new PrintWriter(
					new FileWriter("C:/MIN/Java/JavaProgramming/src/chap24_dataio/PrintStream.txt"));

			char[] chArr = { 'a', 'b', 'c', 'd', 'e' };
			for(int i=0;i<chArr.length;i++) {
				printWriter.println(chArr[i]);
			}
			
			printWriter.write(chArr);
			printWriter.flush();
			printWriter.close();
			
		} catch (IOException ie) {
			ie.getMessage();
		}
	}

}

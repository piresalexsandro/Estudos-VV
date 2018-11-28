package br.com.k19.testes;

import java.io.IOException;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ReceiveKeyboardWriteFile {

	public static void main(String[] args) throws IOException{
		InputStream keyboard = System.in;
		Scanner scanner = new Scanner(keyboard);
		FileOutputStream fileOutput = new FileOutputStream("JavaVaiGravar.txt");
		PrintStream printStream = new PrintStream(fileOutput);
		
		while (scanner.hasNextLine()){
			String line = scanner.nextLine();
			printStream.println(line);
		}
		
		scanner.close();
		
	}

}

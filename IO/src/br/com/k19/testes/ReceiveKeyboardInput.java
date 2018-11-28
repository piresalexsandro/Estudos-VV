package br.com.k19.testes;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ReceiveKeyboardInput {

	public static void main(String[] args) {
		InputStream keyboard = System.in;
		Scanner scanner = new Scanner(keyboard);
		
		while (scanner.hasNextLine()){
			String line = scanner.nextLine();
			System.out.println(line);
		}
		
		scanner.close();
	}

}

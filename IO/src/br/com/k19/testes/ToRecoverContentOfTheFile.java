package br.com.k19.testes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ToRecoverContentOfTheFile {

	public static void main(String[] args) throws IOException {
		//OBS: O arquivo “????.txt” deve ser criado no diretório raiz do projeto IO.
		InputStream file = new FileInputStream("JavaVaiLer.txt");
		Scanner scanner  = new Scanner(file);
		
		while (scanner.hasNextLine()){
			String line = scanner.nextLine();
			System.out.println(line);
		}
		
		scanner.close();
	}

}

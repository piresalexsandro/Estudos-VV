package br.com.k19.testes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ShowSomelinesOfTheFile{

	public static void main(String[] args)  throws IOException{
		FileOutputStream file = new FileOutputStream("JavaVaiGravar.txt");
		PrintStream printStream = new PrintStream(file);
		printStream.println("Primeira Linha - o java esta gravando");
		printStream.println("Segunda Linha - o java esta gravando");
		printStream.println("Terceira Linha - o java esta gravando");
		printStream.println("quarta Linha - o java esta gravando");
		printStream.println("quita Linha - o java esta gravando");
		printStream.println("sexta Linha - o java esta gravando");
		printStream.println("setima Linha - o java esta gravando");
		printStream.println("oitava Linha - o java esta gravando");
		printStream.println("nona Linha - o java esta gravando");
		printStream.println("decima Linha - o java esta gravando");
		
		printStream.close();
	}

}

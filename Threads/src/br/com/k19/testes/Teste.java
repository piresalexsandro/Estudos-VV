package br.com.k19.testes;

public class Teste {
	public static void main ( String [] args ) {
		ThreadExibirMsgConsole task1 = new ThreadExibirMsgConsole("k19");
		ThreadExibirMsgConsole task2 = new ThreadExibirMsgConsole("Java");
		ThreadExibirMsgConsole task3 = new ThreadExibirMsgConsole("Web");
	
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		Thread thread3 = new Thread(task3);
		
		thread1.start();
		thread2.start();
		thread3.start();
	
	}
}

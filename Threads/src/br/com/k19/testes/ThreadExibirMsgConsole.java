package br.com.k19.testes;

public class ThreadExibirMsgConsole implements Runnable {
	private String msg;
	
	public ThreadExibirMsgConsole(String msg){
		this.msg = msg;
	}
	
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println(i + " : " + this.msg);
			if(i % 100 == 0){
				try{
					Thread.sleep(100);
				} catch (InterruptedException e){
					
				}
			}
		}
	}
}

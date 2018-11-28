package br.com.k19.testes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaRemove {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();
		
		long tempo = TestaRemove.removerItem(arrayList);
		System.out.println("ArrayList: " + tempo + "ms");
		
	    tempo = TestaRemove.removerItem(linkedList);
		System.out.println("linkedList: " + tempo + "ms");
	}

	public static long removerItem(List lista) {
		
		int size = 100000;
		
		for (int i = 0; i < size; i++){
			lista.add(i);
		}
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < size; i++){
			lista.remove(0);
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}
	
}



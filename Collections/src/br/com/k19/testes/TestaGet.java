package br.com.k19.testes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaGet {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();
		
		long tempo = TestaAdicionaNoComeco.adicionaNoComeco(arrayList);
		System.out.println("ArrayList: " + tempo + "ms");
		
	    tempo = TestaAdicionaNoComeco.adicionaNoComeco(linkedList);
		System.out.println("linkedList: " + tempo + "ms");
	}

	public static long get(List lista) {
		
		int size = 100000;
		
		for (int i = 0; i < size; i++){
			lista.add(i);
		}
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < size; i++){
			lista.get(i);
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}
	
}



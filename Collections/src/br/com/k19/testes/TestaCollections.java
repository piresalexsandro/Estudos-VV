package br.com.k19.testes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.List;

public class TestaCollections {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList ();
		LinkedList linkedList = new LinkedList ();
		Vector vector = new Vector ();
		List listA = new ArrayList ();
		List listL = new LinkedList ();
		List listV = new Vector ();
		
		listA.add("Joaquim Jose da Silva Xavier");
		listA.add("Martin Luther King Jr");
		listA.add("Rosa Passos");
		listA.add("Nelson Mandela");
		listA.add("Malcom X");
		listA.add("Venus Willians");
		listA.add("Michael Jackson");
		
		int qtdeItemLista = TestaCollections.quantidadeItens(listA);
		System.out.println("Esta lista tem " + qtdeItemLista + " itens.");

		String nomeRecuperar = TestaCollections.recuperaItem(listA);
		System.out.println("Recuperamos " + nomeRecuperar + " da lista.");

		boolean contemOitem = TestaCollections.contemItem(listA);
		if (contemOitem){
			System.out.println("Sim nos temos o item na lista.");
		} else {
			System.out.println("NAO nos temos o item na lista.");
		}

		boolean removerOitem = TestaCollections.removeItem(listA);
		if (removerOitem){
			System.out.println("Item removido com sucesso.");
		} else {
			System.out.println("Item NAO foi removido.");
		}

		boolean limparLista = TestaCollections.limparLista(listA);
		if (limparLista){
			System.out.println("Esta lista esta limpa.");
		}
		
	}
	
	
	public static int quantidadeItens(List lista){
		int size = lista.size();
		return size;
	}
	
	public static boolean limparLista(List lista){
		lista.clear();
		boolean estaLimpa = true;
		return estaLimpa;
	}

	public static boolean contemItem(List lista){
		boolean contem = lista.contains("Rosa Passos");
		return contem;
		
	}

	public static boolean removeItem(List lista){
		boolean remover = lista.remove("Rosa Passos");
		return remover;
		
	}

	public static String recuperaItem(List lista){
		String nomeRecuperado = (String) lista.get(3);
		return nomeRecuperado;
		
	}

}

package queueCollections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");
		//Offer e add -> adicionam elementos na fila
		//Diferenca no comportamento quando a fila esta cheia
		
		fila.offer("Bia");  //retorna uma exception se cheia
		fila.offer("Carlos"); // retorna false se cheia
		fila.offer("Daniel");
		fila.offer("Raphael");
		fila.offer("Gui");
		
		// peek e element -> obter o proximo elemento da fila	
		
		System.out.println(fila.peek()); //retorna null se estiver vazia
		System.out.println(fila.element()); // retorna um exception quando vazia
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains();
		
		System.out.println(fila.poll()); //retorna false
		System.out.println(fila.remove()); //lanca uma exception
		
		
		
		
		
		
		
	
	}	
}

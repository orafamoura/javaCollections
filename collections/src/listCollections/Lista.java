package listCollections;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		//Acessa pelo indice, criando um toString te da nao o endereco, mas o resultado mesmo
		System.out.println(lista.get(3));
		
		lista.remove(1);
		System.out.println(lista.remove(new Usuario("Manu")));
		
		System.out.println("Tem ? " + lista.contains(new Usuario("Lia")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}

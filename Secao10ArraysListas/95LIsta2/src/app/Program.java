package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
//		� Tamanho da lista: size()
//		� Obter o elemento de uma posi��o: get(position)
//		� Inserir elemento na lista: add(obj), add(int, obj)
//		� Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
//		� Encontrar posi��o de elemento: indexOf(obj), lastIndexOf(obj)
//		� Filtrar lista com base em predicado:
//		List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
//		� Encontrar primeira ocorr�ncia com base em predicado:
//		Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
//		� Assuntos pendentes:
//		� interfaces
//		� generics
//		� predicados (lambda)
		
		List<String> list = new ArrayList<>(); //Declarar a lista
		list.add("Anna"); 
		list.add(2, "Marco"); // no local selecionado
		System.out.println(list.size()); //Tamanho da lista
		list.remove("Anna"); // remove com a compacao
		list.remove(1); // remove a posicao
		for (String x : list) {  // Mostrar a lista
			System.out.println(x);
		}
		
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		list.add(2, "Marco"); // no local selecionado
		
		System.out.println(list.size()); //Tamanho da lista
		
		list.remove("Anna"); // remove com a compacao
		list.remove(1); // remove a posicao
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M'); //Vai remover todos que comecar com M
		
		for (String x : list) {  // imprimir a lista
			System.out.println(x);
		}
		
		System.out.println("---------------------");  // Encontrar a posi��o de um elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // quando nao encontra retorna o -1
		System.out.println("---------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // Vai mostrar somente quem come�a com A
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); // Vai mostrar quem primeiro come�a com J
		System.out.println(name);
	}
}
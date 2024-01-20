package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2 , "Marco");
		
		System.out.println(list.size());
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println("-------------------");
//		list.removeIf(name -> name.charAt(0) == 'A');
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println("-------------------");
		System.out.println("Index of Bob : " + list.indexOf("Bob"));
		
		System.out.println("-------------------");
		List<String> result = list.stream().filter(name -> name.charAt(0) == 'A').collect(Collectors.toList());
		for(String name : result) {
			System.out.println(name);
		}
		
		System.out.println("-------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}

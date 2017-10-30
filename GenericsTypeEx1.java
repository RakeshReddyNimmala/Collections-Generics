package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericsTypeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList<Integer> fruits = new ArrayList<>();
Set<Integer> fruits = new HashSet<>();
fruits.add(12);
fruits.add(1223);
Iterator<Integer> ittr = fruits.iterator();
while(ittr.hasNext()){
	Integer fruit = ittr.next();
	System.out.println(fruit +" " );
}
	System.out.println();
	
	//Using Lambda expression in Java 8
	fruits.forEach(fruit -> System.out.print(fruit + " "));
	System.out.println();
	
	//Using method ref in Java 8
	fruits.forEach(System.out::println);
}
	}



package collections;


//import java.util.Iterator;
import java.util.ArrayList;
//import java.util.Collection;
//import java.util.HashSet;
import java.util.List;
//import java.util.Set;
//import java.util.TreeSet;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> x = new ArrayList<>(); //Allows duplicate
 	//Set<String> x = new HashSet<>();
	//Set<String> x = new TreeSet<>(); // sorting order, Set interface don't allow duplicates
	x.add("rakesh");
	x.add("bhaskar");
	x.add("Abc");
	x.add("Abc");
	//x.remove("Abc"); to remove elements
	//x.remove("bcd");
	//x.add(1);
	//Iterator i = x.iterator();
	//System.out.println(i.next());
	//System.out.println(i.next());
	//System.out.println(i.next());
	//System.out.println(i.next());
	//System.out.println(i.next());
	//System.out.println(i.next());

for(String i : x)
{
	System.out.println(i);
}
	}

}

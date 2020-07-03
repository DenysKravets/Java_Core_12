package ua.lviv.lgs;


@SuppressWarnings("unchecked")
public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		//Class MyArrayList takes integer as an argument
		//and uses it to indicate initial size of the List. 
		//If there is no argument, it uses hard coded value of 10.
		MyArrayList myArrayList1 = new MyArrayList();
		
		//Add
		myArrayList1.add(1);
		myArrayList1.add("a");
		myArrayList1.add(new Person("John"));
		myArrayList1.add(1);
		myArrayList1.add("a");
		myArrayList1.add(new Person("Mia"));
		myArrayList1.add(1);
		myArrayList1.add("a");
		myArrayList1.add(new Person("Stanly"));
		myArrayList1.add(1);
		myArrayList1.add("a");
		myArrayList1.add("a");
		myArrayList1.add(new Person("Marta"));
		myArrayList1.add(1);
		myArrayList1.add("a");

		//Remove
		myArrayList1.remove(2);
		
		/*
		System.out.println("\n");
		((Person) myArrayList1.get(4)).procrastinate();
		*/
		System.out.println("\n");
		System.out.println(myArrayList1);
		
		
		MyArrayList<String> myArrayList2 = new MyArrayList<String>(3);
		
		for (int i = 0; i < 8; i++) 
		{
			myArrayList2.add("Catherine");
		}
		
		System.out.println("\n");
		System.out.println(myArrayList2);
	}

}

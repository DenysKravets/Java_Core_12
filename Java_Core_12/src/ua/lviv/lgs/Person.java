package ua.lviv.lgs;

public class Person 
{
	private String name;
	
	Person(String name)
	{
		this.name = name;
	}
	
	public void procrastinate()
	{
		System.out.println("My name is " + name + " and i guess i'll do it later ÅP\\_(Éc)_/ÅP");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}

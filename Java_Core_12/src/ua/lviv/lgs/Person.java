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
		System.out.println("My name is " + name + " and i guess i'll do it later �P\\_(�c)_/�P");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}

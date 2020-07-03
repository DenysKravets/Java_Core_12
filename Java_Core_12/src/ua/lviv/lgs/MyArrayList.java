package ua.lviv.lgs;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class MyArrayList<E> 
{
	private E[] list;
	private int counter = 0;
	
	MyArrayList(int size)
	{
		this.list = (E[]) new Object[size];
	}
	
	MyArrayList()
	{
		this.list = (E[]) new Object[10];
	}
	
	public void add(E object)
	{
		if(counter > list.length - 1)
		{
			E[] placeHolder = (E[]) new Object[(int) (1.5 * (double) (list.length))]; 
			
			for (int i = 0; i < list.length; i++) 
			{
				placeHolder[i] = list[i];
			}

			
			list = placeHolder;
		}
		
		list[counter] = object;
		counter++;
	}
	
	public void remove(int index)
	{
		for(int i = index; i < list.length; i++)
		{
			if(i == list.length - 1)
			{
				list[i] = null;
			} 
			else 
			{
				list[i] = list[i + 1];
			}
		}
	}
	
	public E get(int index)
	{
		return list[index];
	}

	@Override
	public String toString() {
		return Arrays.toString(list);
	}
	
	
	
}

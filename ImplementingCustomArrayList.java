package CustomList;

import java.util.Arrays;

public class MyList<E> {

	private int size =0;
	
	private int index=0;
	
	private int DEFAULT_CAPACITY = 10;
	
	private Object[] objectArray=null;
	
	MyList()
	{
		objectArray = new Object[DEFAULT_CAPACITY];
	}
	
	public void add(Object obj)
	{
		if(size == objectArray.length)
		{
			adjustSize();
		}
		objectArray[size++]= obj;
		
	}
	
	public void remove(int loc)
	{
		if(loc==0)
		{
			System.out.println("Index should be > 0. No elements Deleted!");
			return;
		}
		if(loc > size)
			System.out.println("ArrayIndex out of bound");
		else if(loc<0)
			System.out.println("Negative Value");
		else if(size > 0)
		{
			for(int i=loc-1;i<size;++i)
			{
				objectArray[i] = objectArray[i+1];
			}
			size--;
			
		}
		else
			System.out.println("No elements in Array");

	}
	
	public Object get(int loc)
	{
		if(loc > size)
			System.out.println("ArrayIndex out of bound");
		else if(loc<0)
			System.out.println("Negative Value");
		else if(size > 0)
		{
			return objectArray[loc];
			
		}
		else
			System.out.println("No elements in Array");
		return null;
	}
	
	private void adjustSize() {
		setSize(getSize()*2);
		objectArray = Arrays.copyOf(objectArray, getSize());
		
	}

	public int getSize() {
		return size;
	}

	private void setSize(int size) {
		this.size = size;
	}

	public int getDEFAULT_CAPACITY() {
		return DEFAULT_CAPACITY;
	}

	public static void main(String[] args) {
		
		MyList<String> myList = new MyList<String>();
		
		myList.add("a");
		myList.add("b");
		myList.add("c");
		myList.add("d");
		myList.add("e");
		myList.add("f");
		System.out.println("Before :");
		for(int i = 0; i<myList.size;++i)
		{
			if(myList.get(i)!=null)
			System.out.println(myList.get(i));
		}
		

		myList.remove(0);
		System.out.println("After :");
		for(int i = 0; i<myList.size;++i)
		{
			if(myList.get(i)!=null)
			System.out.println(myList.get(i));
		}
	}
}

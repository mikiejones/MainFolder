
public class HashUtilities implements SimpleMap
{
	
	String[] hashMap;
	int size;
	
	public HashUtilities (int size)
	{		
		this.size = size;
		this.hashMap = new String[size];
	}
	
	

	

	@Override
	public void put(int key, String name) 
	{
		if (this.hashMap[key] == null)
		{
			this.hashMap[key] = name;
		}
		else
			{
				System.out.println(key + " is already taken");
			}
		
	}

	@Override
	public String get(int key) 
	{
		if (this.hashMap[key] == null)
		{
			String empty = "empty";
			return empty;
		}
		else 
		{
			return this.hashMap[key];
		}
		
	}

	@Override
	public void remove(int key) 
	{
		this.hashMap[key] = null;
		System.out.println("The element at key " + key + " has been removed");
		
	}

	@Override
	public boolean isEmpty() 
	{
		for (int i = 0; i < this.size - 1; i++)
		{
			if (this.hashMap[i] != null)
				return false;
		}
		return true;
	}

}

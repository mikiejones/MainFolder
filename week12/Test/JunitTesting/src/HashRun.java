
public class HashRun
{

	private SimpleMap map;
	
	public HashRun()
	{
		map = new HashUtilities(30);
		
	}
	
	
	
	public static void main(String[] args)
	{
		new HashRun().start();
		
	}
	
	public void start()
	{
		HashUtilities hash = (HashUtilities) map;
		
		ShortHash key = new ShortHash();
		int num = key.getHash("Mike");
		System.out.println("returned value: " + num);
		hash.put(num, "mike");
	
		System.out.println("Element at key " + num + " is " + hash.get(num));
		
		num = key.getHash("Dave");
		System.out.println("returned value: " + num);
		hash.put(num, "Dave");
	
		System.out.println("Element at key " + num + " is " + hash.get(num));
		
		
		num = key.getHash("Steven");
		System.out.println("returned value: " + num);
		hash.put(num, "Steven");
	
		System.out.println("Element at key " + num + " is " + hash.get(num));
		
		
		num = key.getHash("Steven");
		System.out.println("returned value: " + num);
		hash.put(num, "Steven");
	
		System.out.println("Element at key " + num + " is " + hash.get(num));
		
	}
	
}

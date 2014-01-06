
public class Node 
{
	private String name;
	private Node above;
	private Node below;
	
	public Node (String name)
	{
		this.name = name;
			
	}
	
	public void setAbove(Node newNode)
	{
		this.above = newNode;		
	}
	
	public void setBelow (Node newNode)
	{
		this.below = newNode;
		
	}
	
	public Node getBelow()
	{
		return this.below;
	}
	
	public Node getAbove()
	{
		return this.above;
	}
	
	public String getName()
	{
		if (this.name == null)
		{ 
			String empty = "Node is empty";
			return empty;		
		}
		
		return this.name; 
	}
	
}




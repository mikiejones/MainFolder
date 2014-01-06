
public class NodeList
{
	
	public Node top;
	public Node bottom;
	
	public NodeList()
	{
				
	}
	
	
	public void addNode(Node newNode)
	{
		if(isEmpty())
		{
			this.bottom = newNode;
			this.top = newNode;			
		}
		else
		{
			//add one to the top
			top.setAbove(newNode); 
			top.getAbove().setBelow(top);				
			this.top = newNode;			
			
		}
		
		
	}
	
	
	
	public boolean isEmpty()
	{
		if (this.bottom == null)
		{
			return true;
		} 
		return false;
		
	}
	
}

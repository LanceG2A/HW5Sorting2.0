
public class Link { //Class to for Links (Nodes)

	int randomNumber;	//Fields for data,
	public Link next;	//and previous/next links(nodes)
	public Link previous;
	
	public Link(int randomNumber) //Constructor initialializes link
	{							//
		previous = null;
		this.randomNumber = randomNumber;
		next = null;
	}
	public Link(Link previous, int randomNumber, Link next) { 
		this.previous = previous;  //
		this.randomNumber = randomNumber;
		this.next = next;	
	}
	
	public int ReturnNumber() {  //Return link information
		return this.randomNumber;
	}
	
}
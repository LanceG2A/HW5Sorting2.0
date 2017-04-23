
public class DoublyLinkedList {

	private Link head; //field to store the first Link
	private int size;  //field to hold the size of the list
	
	public DoublyLinkedList(){  //Base constructor to create an empty list
		head = null;
		size = 0;
	}
	public int[] createArray(){ //Creates an array using the data in the doubly linked list
		Link temp = head;		//This is used for the bubblesort method
		int[] tempArray = new int[size];
		int i = 0;
		while(i < tempArray.length){
			tempArray[i] = temp.randomNumber;
			temp = temp.next;
			i++;
		}
		return tempArray;
	}
	
	public void addStart(int randomNumber)//to add a link in the list at the beginning
	{
		if(head == null)		//checks if the list is empty
		{						//if it is empty it sets the first Link to "color"
			head = new Link(null, randomNumber, null); //and since it is the only Link, 
		}										// next and previous are null (empty)
		else
		{
			Link newLink = new Link(null, randomNumber, head);// makes the "next" link the head node
			head.previous = newLink;					//takes old head (start) and sets previous
			head = newLink;								//to the new start we just made
		}
		size++;
	}	
	public int size()
	{
		return size;
	}
	public void printListForward(){//iterates through the list and prints each Link
		Link current = head;
		if(current != null){
			while(current != null){
				System.out.println(current.randomNumber);
				current = current.next;
		}
		}
		else{
			System.out.println("Empty List");
		}
	}
	public void printListBackward(){//iterates forward through the list, then prints from back to front
		Link current = head;
		if(current != null){
		while(current.next != null){
			current = current.next;
		}
		System.out.println(current.randomNumber);
		while(current.previous != null){
			System.out.println(current.previous.randomNumber);
			current = current.previous;
		}
		}
		else{
			System.out.println("Empty List");
		}
	}
	
	public boolean isEmpty(){
		return head == null;	//returns true if head is null
	}
	

	
	public void deleteLink(int randomNumber){ //deletes a node base on the color name it contains
		Link temp = head;
		while(temp.randomNumber != randomNumber){
			temp = temp.next;
		}
		Link next = temp.next;
		Link previous = temp.previous;
		next.previous = previous;
		previous.next = next;
	}

		
		
	
	public void destroyList(){
		Link temp = head;
		while(temp != null){
			head = null;
			Link temp2 = temp;
			temp = temp.next;
			temp2.previous = null;
			temp2.next = null;
			temp2 = null;
		}
	}
}
	
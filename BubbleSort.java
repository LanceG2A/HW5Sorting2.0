import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
 
 public static void bubbleSort(int[] temp){//bubble sort method takes an array
	 int tempNumber = 0;					//in our main we have created an array from	
	 										//our doubly linked list
	 for(int i = 0; i < temp.length; i++){
		 for(int k = 1; k < (temp.length - i); k++){//this double loop swaps all elements
			 if(temp[k - 1] > temp[k]){				//into the appropriate position
				 tempNumber = temp[k - 1];			//by comparing their values
				 temp[k - 1] = temp[k];
				 temp[k] = tempNumber;
			 }
		 }
	 }
	 
	 
 }
 
	public static void main(String[] args){//Main method creates a random list of numbers
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		DoublyLinkedList numbers = new DoublyLinkedList();
		System.out.println("How many numbers should be in the list?" + "\n");
		int n = keyboard.nextInt();
		int i = 0;
		while(i < n){
			numbers.addStart(rand.nextInt(100) + 1);
			i++;
		}
		System.out.println("The unsorted list printed in order: \n");
		numbers.printListForward();
		System.out.println("Now using BubbleSort to sort the list and then printing: \n");
		int[] bubbleArray = numbers.createArray();
		bubbleSort(bubbleArray);
	    System.out.println();
	    int p = 0;
	    while(p < bubbleArray.length){
	    	System.out.println(bubbleArray[p]);
	    	p++;
	    }
		
		
		
		keyboard.close();
	}
}



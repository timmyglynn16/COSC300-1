package assignment2;
import java.util.*;

/* Josephus class creates the methods used to perform Josephus Problem
 * 
 * this problem follows this recursive structure:
 * 
 * josephus(n, k) = (josephus(n - 1, k) + k-1) % n + 1
 * josephus(1, k) = 1
 * 
 */

public class Josephus {
	private int n; // number of people in a circle
	private int k; // kth person in the circle is killed off  
	private Node head;
	private Node tail;
	private int counter=1;
	CircularLL circle = new CircularLL();
	
	//***************************************************************************************
	// recursively knock off people in the circle in increments of k
	public int Josephus1(int n, int k) { 
		move(k, n);
		
		// this is the Recurisve Joesphus Function!!!
		// FOUND ONLINE @ https://www.geeksforgeeks.org/josephus-problem-set-1-a-on-solution/
		if (n ==1) 
	      return 1;
	    else{
	      return (Josephus1(n - 1, k)); // kth person is killed, (n-1) people are left
	    }
	  }
	//****************************************************************************************
	
	
	// use a linked list to add people to the 'circle' (list)
	// Recursive!!!
	public void addToLL(int i, int n) { 
	    	if(i < n) {
	    		circle.add(i+1);
	    		System.out.println("i " + i);
	    		i++;
	    		addToLL(i, n);
	    	}
	    	else {
	    		tail = null;
	    		head = circle.getFirst();
			    System.out.print("Current list: ");
			    circle.displayList();
	    	}
	    	/*
		circle = new CircularLL();
		
	
		// DO RECURSIVELY
		for (int i = 1; i < n; i++) {
			circle.add(i);
	    
	    tail = null;
	    head = circle.getFirst();
		}*/
		
	}
	
	
	// move last element to the front of linked list 
	// Recursive!!!
	public void move(int k, int n) {
	    
	    // DO RECURSIVELY
	   /* for(int i =0; i < k; i++) { 
	      tail = head;
	      head = head.next;
	    }
	    
	    if (n != 1){ 
	      System.out.println("Person Killed: " + head.data); // display kth person killed from the list
	      circle.delete(head.data); // removes killed person from the list
	      
	      //move head and tail up the list
	      tail = tail.next; 
	      head = head.next; 
	    }*/
		
	    if(circle.getCount() == 1)
	    {
	    	System.out.println("The Winner is " + head.data);
	    }
	    else if(counter%k != 0&& head.next != null)
	    {
	        tail = head;
	        head = head.next;
	        counter++;
	        move(k,n);
	    }
	    else if(counter%k != 0 && head.next==null) 
	    {
//	    	System.out.println("2");
	    	tail = head;
	    	head = circle.getFirst();
	    	counter++;
	    	move(k,n);
	    }
	    else
	    {

	        System.out.println("Person Killed: " + head.data);
	        circle.delete(head.data);
		    System.out.print("Current list: ");
		    circle.displayList();
	        tail = head;
	        head = head.next;
	        counter = 1;
	        n--;
	    }
	  }
	}

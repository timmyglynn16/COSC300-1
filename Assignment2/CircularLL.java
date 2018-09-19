package assignment2;

/* CircularLL creates the methods to implement the Circular Linked List:
 *  - check if the list is empty
 *  - add members to the list
 *  - delete kth member from the list
 *  - display the list
 */

public class CircularLL {

	  private Node first;
	  private Node current;
	  private int count;
	  public CircularLL getCurrent;
	  
	  public CircularLL(){
	    first = null;
	    current = null;
	    count = 0;
	  }
	  
	  public boolean isEmpty() {
	    return first == null;
	  }
	  
	  public void step(){
	    current = current.next;
	  }
	  
	  public Node getCurrent(){
	    return current;
	  }
	  
	  public Node getFirst(){
	    return first;
	  }
	  
	  public int getCount() {
		  return count;
	  }
	  public void add(int x){
	    Node newNode = new Node(x);
	    if (isEmpty()) {
	      first = newNode;
	      current = first;
	    } 
	    else {
	      current.next = newNode;
	    }
	    
	    newNode.next = first;
	    step();
	    count++;
	  }
	  
	  public void delete(int x) {
	    Node prev = first;
	    Node curr = first.next;
	    	 
	    while (curr.data != x) {
	      prev = curr;
	      curr = curr.next;
	    } 
	    
	    if (count == 1) {
	      first = null;
	      count--;
	    } 
	    else if (curr == first) {
	      prev.next = curr.next;
	      first = curr.next;
	      count--;
	    } 
	    else {
	      prev.next = curr.next;
	      count--;
	    }
	  }
	  
	  // display the list recursively
	  // help from David B. (tutor)
	  public void displayList() {
		  displayList(first, 0);
		  System.out.println();
	  }
	  
	  private void displayList(Node current, int pos) {
	    //int x = 0;
	    //Node print = first;
	    
	    if(pos < count)
	    {
	            current.displayNode();
	    		displayList(current.next, pos+1);
	    }	
	    // NO WHILE - DO RECURSIVELY
	    /*while (x < count) {
	      print.displayNode();
	      print = print.next;
	      x++;
	    }*/
	    
	  }
	  
	}

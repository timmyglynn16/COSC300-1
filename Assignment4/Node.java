public class Node implements Comparable<Node> {
	
	public int x;
	public static int counter = 0;
	
	public Node (int x) {
		this.x = x;
		  
	}
	
	// @Override - method overriding to achieve run time polymorphism 
	@Override 
	public int compareTo(Node other) {
		counter++;
		return Integer.compare(this.x, other.x);
		  
	}
		 
	@Override
	public String toString() {
		return x + "";
		  
	}
		
}
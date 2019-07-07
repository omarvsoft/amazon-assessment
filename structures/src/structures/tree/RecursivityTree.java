package structures.tree;

public class RecursivityTree {
	
	public static void main(String args[]) {
		
		/*          40
		 *      20       50
		 *   10    30
		 */
		
		Node n10 = new Node(10, null, null);
		Node n30 = new Node(30, null, null);
		Node n20 = new Node(20, n10, n30);
		Node n50 = new Node(50, null, null);
		Node n40 = new Node(40, n20, n50);
		
		RecursivityTree rt = new RecursivityTree();
		
		rt.printTree(n40);
		
		System.out.println("Left nodes sum is: " + rt.sumLeftNodes(n40) );
		System.out.println("Right nodes sum is: " + rt.sumRighttNodes(n40) );
		
		/*
		 *                  60
		 *          40             80
		 *      20     50       70
		 *   10    30
		 */
		
		Node n70 = new Node(70, null, null);
		Node n80 = new Node(80, n70, null);
		Node n60 = new Node(60, n40, n80);
		
		System.out.println("Left nodes sum is: " + rt.sumLeftNodes(n60) );
		System.out.println("Right nodes sum is: " + rt.sumRighttNodes(n60) );
		
	}
	
	public void printTree(Node node) {
		if ( node.left == null && node.right == null ) {
			System.out.print(node.getData());
		} else {
			System.out.print(node.getData());
			printTree(node.right);
			printTree(node.left);
		} 
	}
	
	public int sumLeftNodes(Node node) {
		
		if ( node.left == null && node.right == null ) {
			return node.getData();
			
		} else if (node.left != null){
			return node.getData() + sumLeftNodes(node.left);
		}
		
		return 0;
	}
	
	public int sumRighttNodes(Node node) {
		
		if ( node.left == null && node.right == null ) {
			return node.getData();
			
		} else if (node.right != null){
			return node.getData() + sumRighttNodes(node.right);
		}
		
		return 0;
	}

}

package structures.list;

public class RecursivityKinkedList {
	
	public static void main(String args[]) {
		RecursivityKinkedList rt = new RecursivityKinkedList();
		
		Node n1 = new Node(1);
		n1.next = new Node(2);
		n1.next.next = new Node(3);
		
		Node n2 = new Node(11);
		n2.next = new Node(12);
		n2.next.next = new Node(13);
		
		rt.printList(n1);
		rt.printList(n2);

	}
	
	public void printList(Node node) {
		if ( node.next == null ) {
			System.out.println( node.data );
		} else {
			System.out.println( node.data );
			printList( node.next );
		}
	}
	

}

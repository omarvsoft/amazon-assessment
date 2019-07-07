package structures.list;

public class LinkedList {
	
	Node head;
	
	public static LinkedList insert( LinkedList list, int data) {
		
		Node newNode = new Node(data);
		newNode.next = null;
		
		if (list.head == null ) {
			list.head = newNode;
		} else {
			
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			
			last.next = newNode;
		}
		
		return list;
		
	}
	
	public static void printList( LinkedList list) {
		Node currNode = list.head;
		
		System.out.print("LinkedList: ");
		
		while (currNode != null ) {
			System.out.println( currNode.data + " ");
			
			currNode = currNode.next;
		}
	}
	
	public static LinkedList deleteByKey( LinkedList list, int key) {
		
		Node currNode = list.head, prev = null;
		
		if (currNode != null && currNode.data == key) {
			list.head = currNode.next;
			
			System.out.println( key + " found and deleted");
			
			return list;
		}
		
		while (currNode != null && currNode.data != key) {
			
			prev = currNode;
			currNode = currNode.next;
		}
		
		if (currNode != null) {
			prev.next = currNode.next;
			System.out.println( key + " found and deleted");
		}
		
		if (currNode == null) {
			System.out.println( key + " not found");
		}
		
		return list;
	}
	
	public static LinkedList deleteAtPosition(LinkedList list, int index) {
		Node currNode = list.head, prev = null;
		
		if (index == 0 && currNode != null) {
			list.head = currNode.next;
			
			System.out.println( index + " position element deleted");
			
			return list;
		}
		
		int counter = 0;
		
		while(currNode != null) {
			
			if (counter == index) {
				prev.next = currNode.next;
				
				System.out.println(index + " position element deleted");
				break;
			} else {
				prev = currNode;
				currNode = currNode.next;
				counter++;
			}
		}
		
		if (currNode == null) {
			System.out.println( index + "position element not found");
		}
		
		return list;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		/* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
  
        // Print the LinkedList 
        printList(list); 
  
        // 
        // ******DELETION BY KEY****** 
        // 
  
        // Delete node with value 1 
        // In this case the key is ***at head*** 
        deleteByKey(list, 1); 
  
        // Print the LinkedList 
        printList(list); 
  
        // Delete node with value 4 
        // In this case the key is present ***in the middle*** 
        deleteByKey(list, 4); 
  
        // Print the LinkedList 
        printList(list); 
  
        // Delete node with value 10 
        // In this case the key is ***not present*** 
        deleteByKey(list, 10); 
  
        // Print the LinkedList 
        printList(list); 
        
        // Delete node at position 2 
        // In this case the key is present ***in the middle*** 
        deleteAtPosition(list, 2); 
  
        // Print the LinkedList 
        printList(list); 
		
	}
	

}

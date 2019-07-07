package structures.tree;

public class BinaryTree {
	
	private Node root;
	
	public Node getRoot() {
		return root;
	}
	
	public void inOrder(Node root) {
		if (root == null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.getData() + ",");
		inOrder(root.right);
	}
	
	public void insert(Node node, int newData) {
		
		if (this.root == null ) {
			this.root = new Node(newData, null, null);
			return;
		}
		
		int compareValue = newData - node.getData();
		
		if (compareValue < 0) {
			if (node.left == null ) {
				node.left = new Node(newData, null, null);
			}else {
				insert(node.right, newData);
			}
		} else if (compareValue > 0) {
			if (node.right == null) {
				node.right = new Node(newData, null, null);
			} else {
				insert(node.right, newData);
			}
		}
		
		
	}

}

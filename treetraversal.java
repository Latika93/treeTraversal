package tree;

class Node{
	int item;
	Node left, right;
	public Node(int key){
		item = key;
		left =  right = null;
	}
}

class TreeTraversal {
	Node root;
	
	TreeTraversal(){
		root = null;
	}
	
	void inorder(Node node) {
		if(node == null) {
			return;
		}
		 inorder(node.left);
		 System.out.print(node.item + "->");
		 inorder(node.right);
	}
	
	void preorder(Node node) {
		if(node == null) {
			return;
		}
		 
		 System.out.print(node.item + "->");
		 preorder(node.left);
		 preorder(node.right);
	}
	
	void postorder(Node node) {
		if(node == null) {
			return;
		}
		 postorder(node.left);
		 postorder(node.right);
		 System.out.print(node.item + "->");
	}
	
	

	public static void main(String[] args) {
		TreeTraversal tree = new TreeTraversal();
		tree.root = new Node(2);
		tree.root.left = new Node(3);
		tree.root.right = new Node(4);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(4);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(8);
		
		tree.preorder(tree.root);
		System.out.println("");
		tree.postorder(tree.root);
		System.out.println("");
		tree.inorder(tree.root);
	}

}

package tree;

class Node{
	int item;
	Node left, right;
	public Node(int key){
		item = key;
		left =  right = null;
	}
}

public class IsFullBinary {
	
	Node root = null;
	
	static boolean isFullBinary(Node node) {
		if(node == null) 
			return true;
		if(node.left == null && node.right == null)
			return true;
		if(node.left != null && node.right == null)
			return (isFullBinary(node.left) && isFullBinary(node.right));
		return false;	
		
		
	}
	
	
	
	public static void main(String[] args) {

		IsFullBinary tree = new IsFullBinary();
		tree.root = new Node(3);
		tree.root.left = new Node(32);
		tree.root.right = new Node(31);
		tree.root.left.left = new Node(13);
		tree.root.left.right = new Node(63);
		tree.root.right.left = new Node(34);
		tree.root.right.right = new Node(38);
		
		if(isFullBinary(tree.root)) {
			System.out.println("Full binary");
		}else {
			System.out.println("Not Full Binary");
		}
		
	}

}

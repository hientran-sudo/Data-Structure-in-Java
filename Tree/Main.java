
public class Main {
	public static void main (String[] args) {
	BinaryTree bt = new BinaryTree();
	    bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);
	    System.out.println("InOrder Tranversal");
	    bt.inOrder();
	    System.out.println("\n" + "PreOrder Tranversal");
	    bt.preOrder();	
	}

}

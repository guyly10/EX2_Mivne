

public class Node implements Comparable<Node>{

	public Node parent;
	public Node right;
	public Node left;
	public Visitor data;

	public Node(Visitor data) {
		this.right = null;
		this.left = null;
		this.data = data;
		this.parent = null;
	}
	
	public Node (Node left, Node right, Visitor tmpVisitor)
	{
		this.left = left;
		this.right = right;
		this.data = tmpVisitor;
	}
	
	
	@Override
	public int compareTo(Node o) {
		Visitor v1 = this.data;
		Visitor v2 = o.data;
		
		return v1.compareTo(v2);
	}
	
	public Boolean isLeaf()
	{
		return !data.charData.equals("__LEAF__");
	}
	
	@Override
	public String toString() {
		return this.data.toString();
	}
	
}

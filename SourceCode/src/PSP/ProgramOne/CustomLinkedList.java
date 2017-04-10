package PSP.ProgramOne;

public class CustomLinkedList {
	private Node firstNode;
	private Node lastNode;
	
	public CustomLinkedList() {
		this.firstNode = null;
		this.lastNode = null;
	}
	
	public void addNode(Node node) {
		if(this.firstNode == null) {
			this.firstNode = node;
			this.lastNode = node;
			
			this.firstNode.setNextNode(this.lastNode);
			this.lastNode.setNextNode(null);
			
		} else {
			lastNode.setNextNode(node);
			this.lastNode = node;
		}
	}
	
	public void addNode(double data) {
		Node node = new Node();
		node.setValue(data);
		addNode(node);
	}
	
	public void addNode(double[] data) {
		for(int i = 0; i < data.length; i++) {
			Node node = new Node();
			node.setValue(data[i]);
			addNode(node);
		}
	}
	
	public Node removeLastNode() {
		
		Node node;
		
		if(this.firstNode == this.lastNode) {
			node = this.firstNode;
			
			this.firstNode = null;
		} else {
			for(node = this.firstNode; node.getNextNode() != this.lastNode; node = node.getNextNode());
			
			this.lastNode = node;
		}
		
		
		return node;
	}
	
	public Node getFirstNode() {
		return firstNode;
	}
	
	public void setFirstNode(Node firstNode) {
		this.firstNode = firstNode;
	}
	
	public Node getLastNode() {
		return lastNode;
	}
	
	public void setLastNode(Node lastNode) {
		this.lastNode = lastNode;
	}
}

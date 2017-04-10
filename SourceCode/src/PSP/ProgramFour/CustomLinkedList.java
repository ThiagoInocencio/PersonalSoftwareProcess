package PSP.ProgramFour;

/*
 * Program Assignment: PSP assignment 4                                                    
 * Name: Thiago Inocêncio
 * Date: 05/04/2017 
 * Description:  class that represents a custom LinkedList data structure
 */

// CLASS BEGIN: CustomLinkedList
public class CustomLinkedList {
	private Node firstNode;
	private Node lastNode;
	
	// METHOD BEGIN: CustomLinkedList
	public CustomLinkedList() {
		this.firstNode = null;
		this.lastNode = null;
	}
	// METHOD END
	
	// METHOD BEGIN: addNode
	public void addNode(Node node) {
		if(this.firstNode == null) {
			this.firstNode = node;
			this.lastNode = node;
			
			this.firstNode.setNextNode(this.lastNode);
			this.lastNode.setNextNode(null);
			
		} 
		else {
			lastNode.setNextNode(node);
			this.lastNode = node;
		}
	}
	// METHOD END
	
	// METHOD BEGIN: addNode
	public void addNode(double data) {
		Node node = new Node();
		node.setNodeValue(data);
		addNode(node);
	}
	// METHOD END
	
	// METHOD BEGIN: addNode
	public void addNode(double[] data) {
		for(int i = 0; i < data.length; i++) {
			Node node = new Node();
			node.setNodeValue(data[i]);
			addNode(node);
		}
	}
	// METHOD END
	
	// METHOD BEGIN: removeLastNode
	public Node removeLastNode() {
		
		Node node;
		
		if(this.firstNode == this.lastNode) {
			node = this.firstNode;
			
			this.firstNode = null;
		} 
		else {
			for(node = this.firstNode; node.getNextNode() != this.lastNode; node = node.getNextNode());
			
			this.lastNode = node;
		}
		
		return node;
	}
	// METHOD END
	
	/*
	 *    The following methods is used to encapsulate the attributes of this class                                                                 
	 */
	
	// METHOD BEGIN: getFirstNode
	public Node getFirstNode() {
		return firstNode;
	}
	// METHOD END
	
	// METHOD BEGIN: setFirstNode
	public void setFirstNode(Node firstNode) {
		this.firstNode = firstNode;
	}
	// METHOD END
	
	// METHOD BEGIN: getLastNode
	public Node getLastNode() {
		return lastNode;
	}
	// METHOD END
	
	// METHOD BEGIN: setLastNode
	public void setLastNode(Node lastNode) {
		this.lastNode = lastNode;
	}
	// METHOD END
}
// CLASS END

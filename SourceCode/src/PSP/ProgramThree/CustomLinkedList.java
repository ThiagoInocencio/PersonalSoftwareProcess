package PSP.ProgramThree;

/*
 * Program Assignment: PSP assignment 3                                                   
 * Name: Thiago Inocêncio
 * Date: 30/03/2017 
 * Description:  class that represents a custom LinkedList data structure
 */

// CLASS BEGIN: CustomLinkedList
public class CustomLinkedList {
	private Node firstNode;
	private Node lastNode;
	private int numberOfNodes;
	
	// METHOD BEGIN: CustomLinkedList
	public CustomLinkedList() {
		this.firstNode = null;
		this.lastNode = null;
		this.numberOfNodes = 0;
	}
	// METHOD END
	
	// METHOD BEGIN: addNode(Node node)
	public void addNode(Node node) {
		
		this.numberOfNodes += 1;
		
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
	
	// METHOD BEGIN: addNode(double xValue, double yValue)
	public void addNode(double xValue, double yValue) {
		Node node = new Node();
		node.setXValue(xValue);
		node.setYValue(yValue);
		addNode(node);
	}
	// METHOD END
	
	// METHOD BEGIN: addNode(double[] xValues, double[] yValues)
	public void addNode(double[] xValues, double[] yValues) {
		
		if(!(xValues.length == yValues.length)) return;
		
		for(int i = 0; i < xValues.length; i++) {
			Node node = new Node();
			node.setXValue(xValues[i]);
			node.setYValue(yValues[i]);
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
		
		this.numberOfNodes -= 1;
		
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

	// METHOD BEGIN: getNumberOfNodes
	public int getNumberOfNodes() {
		return numberOfNodes;
	}
	// METHOD END
	
}
// CLASS END

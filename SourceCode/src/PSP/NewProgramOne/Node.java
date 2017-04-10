package PSP.NewProgramOne;

/*
 * Program Assignment: PSP assignment 1                                                     
 * Name: Thiago Inocêncio
 * Date: 23/03/2017 
 * Description:  A class that hold a node composed of data and a reference to the next node in the sequence
 */

// CLASS BEGIN: Node
public class Node {
	private Node nextNode;
	private double nodeValue;
	
	/*
	 *    The following methods is used to encapsulate the attributes of this class                                                                 
	 */
	
	// METHOD BEGIN: getNextNode
	public Node getNextNode() {
		return nextNode;
	}
	// METHOD END
	
	// METHOD BEGIN: setNextNode
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	// METHOD END
	
	// METHOD BEGIN: getNodeValue
	public double getNodeValue() {
		return nodeValue;
	}
	// METHOD END
	
	// METHOD BEGIN: setNodeValue
	public void setNodeValue(double newNodeValue) {
		this.nodeValue = newNodeValue;
	}
	// METHOD END
}
// CLASS END
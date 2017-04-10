package PSP.ProgramFour;

/*
 * Program Assignment: PSP assignment 4                                                     
 * Name: Thiago Inocêncio
 * Date: 05/04/2017 
 * Description:  A class that hold a node composed of data and a reference to the next node in the sequence
 */

// CLASS BEGIN: Node
public class Node {
	private Node nextNode;
	private Double nodeValue;
	
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
	public Double getNodeValue() {
		return nodeValue;
	}
	// METHOD END
	
	// METHOD BEGIN: setNodeValue
	public void setNodeValue(Double newNodevalue) {
		this.nodeValue = newNodevalue;
	}
	// METHOD END
}
// CLASS END
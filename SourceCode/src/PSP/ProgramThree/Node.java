package PSP.ProgramThree;

/*
 * Program Assignment: PSP assignment 3                                                     
 * Name: Thiago Inocêncio
 * Date: 30/03/2017 
 * Description:  A class that hold a node composed of data and a reference to the next node in the sequence
 */

// CLASS BEGIN: Node
public class Node {
	private Node nextNode;
	private Double xValue;
	private Double yValue;
	
	/*
	 *    The following methods are used to encapsulate the attributes of this class                                                                 
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
	
	// METHOD BEGIN: getXValue
	public Double getXValue() {
		return xValue;
	}
	// METHOD END
	
	// METHOD BEGIN: setXValue
	public void setXValue(Double xValue) {
		this.xValue = xValue;
	}
	// METHOD END
	
	// METHOD BEGIN: getYValue
	public Double getYValue() {
		return yValue;
	}
	// METHOD END
		
	// METHOD BEGIN: setYValue
	public void setYValue(Double yValue) {
		this.yValue = yValue;
	}
	// METHOD END
	
}
// CLASS END
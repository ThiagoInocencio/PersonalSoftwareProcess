package PSP.ProgramOne;

public class Node {
	private Node nextNode;
	private Double nodeValue;
	
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Double getValue() {
		return nodeValue;
	}
	public void setValue(Double newNodeValue) {
		this.nodeValue = newNodeValue;
	}
}

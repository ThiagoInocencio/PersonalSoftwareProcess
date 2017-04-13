package PSP.ProgramThree;

/*
 * Program Assignment: PSP assignment 3                                                   
 * Name: Thiago Inocêncio
 * Date: 30/03/2017 
 * Description: Class that represents an ordered pair and do statistical calculations based on the data encapsulated by its CustomLinkedList attribute
 */

// CLASS BEGIN: OrderedPair
public class OrderedPair {

	private CustomLinkedList data;
	
	private double sumOf_X_Values;
	private double meanOf_X_Values;
	
	private double sumOf_Y_Values;
	private double meanOf_Y_Values;
	
	private double sumOf_X_SquaredValues;
	private double sumOf_Y_SquaredValues;
	private double sumOf_X_Plus_Y_Values;
	
	// METHOD BEGIN: OrderedPair
	public OrderedPair() {
		this.data = new CustomLinkedList();
		
		this.sumOf_X_Values = 0.00;
		this.sumOf_Y_Values = 0.00;
		this.meanOf_X_Values = 0.00;
		this.meanOf_Y_Values = 0.00;
		this.sumOf_Y_SquaredValues = 0.00;
		this.sumOf_X_SquaredValues = 0.00;
		this.sumOf_X_Plus_Y_Values = 0.00;
	}
	// METHOD END
	
	// METHOD BEGIN: OrderedPair
	public OrderedPair(double[] xValues, double[] yValues) {
		
		this.data = new CustomLinkedList();
		
		this.data.addNode(xValues, yValues);
		
		this.calculateValues();
	}
	// METHOD END
	
	// METHOD BEGIN: calculateValues
	public void calculateValues() {
		this.calculateSumOf_X_Values();
		this.calculateSumOf_Y_Values();
		this.calculateMeanOf_X_Values();
		this.calculateMeanOf_Y_Values();
		this.calculateSumOf_X_Plus_Y_Values();
		this.calculateSumOf_X_Squared_Values();
		this.calculateSumOf_Y_Squared_Values();
	}
	// METHOD END
	
	/*
	 *    The following methods are used to perform calculations in this Ordered Pair                                                             
	 */
	
	// METHOD BEGIN: calculateSumOf_X_Values
	public void calculateSumOf_X_Values() {
		
		Node node;
		this.sumOf_X_Values = 0.00;
		
		for(node = this.data.getFirstNode(); node != null; node = node.getNextNode()) {
			this.sumOf_X_Values += node.getXValue();
		}
		
	}
	// METHOD END
	
	// METHOD BEGIN: calculateMeanOf_X_Values
	public void calculateMeanOf_X_Values() {
		
		this.meanOf_X_Values = this.sumOf_X_Values / this.getData().getNumberOfNodes();
		
	}
	// METHOD END
	
	// METHOD BEGIN: calculateSumOf_Y_Values
	public void calculateSumOf_Y_Values() {
		
		Node node;
		this.sumOf_Y_Values = 0.00;
		
		for(node = this.data.getFirstNode(); node != null; node = node.getNextNode()) {
			this.sumOf_Y_Values += node.getYValue();
		}
		
	}
	// METHOD END
	
	// METHOD BEGIN: calculateMeanOf_Y_Values
	public void calculateMeanOf_Y_Values() {
		
		this.meanOf_Y_Values = this.sumOf_Y_Values / this.getData().getNumberOfNodes();
		
	}
	// METHOD END
	
	// METHOD BEGIN: calculateSumOf_X_Plus_Y_Values
	public void calculateSumOf_X_Plus_Y_Values() {
		
		Node node;
		this.sumOf_X_Plus_Y_Values = 0.00;
		
		for(node = this.data.getFirstNode(); node != null; node = node.getNextNode()) {
			this.sumOf_X_Plus_Y_Values += (node.getXValue() * node.getYValue());
		}
		
	}
	// METHOD END
	
	// METHOD BEGIN: calculateSumOf_X_Squared_Values
	public void calculateSumOf_X_Squared_Values() {
		
		Node node;
		this.sumOf_X_SquaredValues = 0.00;
		
		for(node = this.data.getFirstNode(); node != null; node = node.getNextNode()) {
			this.sumOf_X_SquaredValues += (node.getXValue() * node.getXValue());
		}
		
	}
	// METHOD END
	
	// METHOD BEGIN: calculateSumOf_Y_Squared_Values
	public void calculateSumOf_Y_Squared_Values() {
		
		Node node;
		this.sumOf_Y_SquaredValues = 0.00;
		
		for(node = this.data.getFirstNode(); node != null; node = node.getNextNode()) {
			this.sumOf_Y_SquaredValues += (node.getYValue() * node.getYValue());
		}
		
	}
	// METHOD END
	
	/*
	 *    The following methods are used to encapsulate the attributes of this class                                                                 
	 */
	
	// METHOD BEGIN: getData
	public CustomLinkedList getData() {
		return data;
	}
	// METHOD END
	
	// METHOD BEGIN: getData
	public double getSumOf_X_Values() {
		return sumOf_X_Values;
	}
	// METHOD END
	
	// METHOD BEGIN: getData
	public double getMeanOf_X_Values() {
		return meanOf_X_Values;
	}
	// METHOD END
	
	// METHOD BEGIN: getData
	public double getSumOf_Y_Values() {
		return sumOf_Y_Values;
	}
	// METHOD END
	
	// METHOD BEGIN: getData
	public double getMeanOf_Y_Values() {
		return meanOf_Y_Values;
	}
	// METHOD END
	
	// METHOD BEGIN: getData
	public double getSumOf_X_SquaredValues() {
		return sumOf_X_SquaredValues;
	}
	// METHOD END
	
	// METHOD BEGIN: getData
	public double getSumOf_Y_SquaredValues() {
		return sumOf_Y_SquaredValues;
	}
	// METHOD END
	
	// METHOD BEGIN: getData
	public double getSumOf_X_Plus_Y_Values() {
		return sumOf_X_Plus_Y_Values;
	}
	// METHOD END
}
//CLASS END

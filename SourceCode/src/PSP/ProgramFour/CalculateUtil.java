package PSP.ProgramFour;

/*
 * Program Assignment: PSP assignment 4                                                     
 * Name: Thiago Inocêncio
 * Date: 05/04/2017 
 * Description:  A utility class that holds many mathematic useful and reusable methods
 */

// CLASS BEGIN: CalculateUtil
public final class CalculateUtil {
	
	/*
	 *    Reuse instructions
	 *    Double mean(CustomLinkedList data)
	 *    Purpose: to calculate a mean given a CustomLinkedList object     
	 *    Limitations: the given CustomLinkedList object must have at least one node, otherwise the returned value will be zero.
	 *    Return: A double value that contain the mean of the CustomLinkedList's values.
	 */
	// METHOD BEGIN: mean
	public static Double mean(CustomLinkedList data) {
		
		int cont = 0;
		double mean = 0.00;
		Node node;
		
		for(node = data.getFirstNode(); node != null; node = node.getNextNode()) {
			cont++;
			mean += node.getNodeValue();
		}
		
		if(cont > 0) 
			mean = mean/cont;
		
		return mean;
		
	}
	// METHOD END
	
	/*
	 *    Reuse instructions
	 *    Double stdDeviation(CustomLinkedList data)
	 *    Purpose: to calculate a standard deviation given a CustomLinkedList object     
	 *    Limitations: the given CustomLinkedList object must have at least one node, otherwise the returned value will be zero.
	 *    Return: A double value that contain the standard deviation of the CustomLinkedList's values.
	 */
	// METHOD BEGIN: stdDeviation
	public static Double stdDeviation(CustomLinkedList data) {
		
		Double mean = CalculateUtil.mean(data);
		Double stdDeviation = 0.00;
		int cont = 0;
		Node node;
		
		if(mean == 0.00) 
			return 0.00;
		
		for(node = data.getFirstNode(); node != null; node = node.getNextNode()) {
			cont++;
			stdDeviation = stdDeviation + Math.pow((node.getNodeValue() - mean), 2);
		}
		
		stdDeviation = stdDeviation / (cont-1);
		
		stdDeviation = Math.sqrt(stdDeviation);
		
		return stdDeviation;
	}
	// METHOD END
	
	
	/*
	 *    Reuse instructions
	 *    SizeRange relativeSizeRange(CustomLinkedList data)
	 *    Purpose: to calculate relative size ranges for very small, small, miduem, large, and very large ranges using standard deviation.
	 *    Limitations: the given CustomLinkedList object must have at least one node.
	 *    Return: A SizeRange object that encapsulate the relative size ranges of the given CustomLinkedList object
	 */
	// METHOD BEGIN: relativeSizeRange
	public static SizeRange relativeSizeRange(CustomLinkedList data) {
		
		SizeRange sizeRange = new SizeRange();
		
		// This statement converts all elements in the CustomLinkedList to natural logarithm
		for(Node node = data.getFirstNode(); node != null; node = node.getNextNode()) 
			node.setNodeValue(Math.log(node.getNodeValue()));
		
		double averageOfData = CalculateUtil.mean(data);
		double stdDeviationOfData = CalculateUtil.stdDeviation(data);
		
		// Calculation the logarithmic ranges
		sizeRange.setVerySmallSizeRange(averageOfData - 2 * stdDeviationOfData);
		sizeRange.setSmallSizeRange(averageOfData - stdDeviationOfData);
		sizeRange.setMediumSizeRange(averageOfData);
		sizeRange.setLargeSizeRange(averageOfData + stdDeviationOfData);
		sizeRange.setVeryLargeSizeRange(averageOfData + 2 * stdDeviationOfData);
		
		// Converting the natural log values calculating the anti-logarithm (e to the power of the log value)
		sizeRange.setVerySmallSizeRange(Math.pow((Math.E) , sizeRange.getVerySmallSizeRange()));
		sizeRange.setSmallSizeRange(Math.pow((Math.E) , sizeRange.getSmallSizeRange()));
		sizeRange.setMediumSizeRange(Math.pow((Math.E) , sizeRange.getMediumSizeRange()));
		sizeRange.setLargeSizeRange(Math.pow((Math.E) , sizeRange.getLargeSizeRange()));
		sizeRange.setVeryLargeSizeRange(Math.pow((Math.E) , sizeRange.getVeryLargeSizeRange()));
		
		return sizeRange;
		
	}
	// METHOD END
	
}
// CLASS END

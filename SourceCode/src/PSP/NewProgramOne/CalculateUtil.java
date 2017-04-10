package PSP.NewProgramOne;

/*
 * Program Assignment: PSP assignment 1                                                     
 * Name: Thiago Inocêncio
 * Date: 08/03/2017 
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
}
// CLASS END

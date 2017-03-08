package PSP.ProgramOne;

public final class CalculateUtil {
	public static Double mean(CustomLinkedList data) {
		
		int cont = 0;
		double mean = 0.00;
		Node node;
		
		for(node = data.getFirstNode(); node != null; node = node.getNextNode()) {
			cont++;
			mean += node.getValue();
		}
		
		if(cont > 0) 
			mean = mean/cont;
		
		return mean;
		
	}
	
	public static Double stdDeviation(CustomLinkedList data) {
		
		Double mean = CalculateUtil.mean(data);
		Double stdDeviation = 0.00;
		int cont = 0;
		Node node;
		
		if(mean == 0.00) return 0.00;
		
		for(node = data.getFirstNode(); node != null; node = node.getNextNode()) {
			cont++;
			stdDeviation = stdDeviation + Math.pow((node.getValue() - mean), 2);
		}
		
		stdDeviation = stdDeviation / (cont-1);
		
		stdDeviation = Math.sqrt(stdDeviation);
		
		return stdDeviation;
	}
}

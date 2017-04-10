package PSP.ProgramOne;
import java.text.DecimalFormat;

public class Main {
	public static void main(String args[]) {
		CustomLinkedList estimateProxy = new CustomLinkedList();
		CustomLinkedList developmentHours = new CustomLinkedList();
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
	
		estimateProxy.addNode(new double[]{160.00, 591.00, 114.00, 229.00, 230.00, 270.00, 128.00, 1657.00, 624.00, 1503.00});
		developmentHours.addNode(new double[]{15.00, 69.9, 6.5, 22.4, 28.4, 65.9, 19.4, 198.7, 38.8, 138.2});
		
		System.out.println("For Table Estimate Proxy Size: ");
		System.out.print("Mean: " + decimalFormat.format(CalculateUtil.mean(estimateProxy)));
		System.out.print("\nStandard Deviation: " + decimalFormat.format(CalculateUtil.stdDeviation(estimateProxy)));
		
		System.out.println("\n\nFor Table Estimate Proxy Size: ");
		System.out.print("Mean: " + decimalFormat.format(CalculateUtil.mean(developmentHours)));
		System.out.print("\nStandard Deviation: " + decimalFormat.format(CalculateUtil.stdDeviation(developmentHours)));
	}
}

package PSP.ProgramFour;
import java.text.DecimalFormat;

/*
 * Program Assignment: PSP assignment 4                                                     
 * Name: Thiago Inocêncio
 * Date: 05/04/2017 
 * Description: The main class of the PSP's fourth program
 */

// CLASS BEGIN: Main
public class Main {
	// METHOD BEGIN: main
	public static void main(String args[]) {
		DecimalFormat decimalFormat = new DecimalFormat("#.####");
	
		CustomLinkedList locPerMethodData = new CustomLinkedList();
		
		locPerMethodData.addNode(new double[]{18.00/3.00 , 18.00/3.00, 25.00/3.00, 31.00/3.00, 37.00/3.00, 82.00/5.00, 82.00/4.00, 87.00/4.00, 89.00/4.00, 230.00/10.00, 85.00/3.00, 87.00/3.00, 558.00/10.00});
		
		SizeRange locPerMethodSizeRange = CalculateUtil.relativeSizeRange(locPerMethodData);
		
		System.out.println("Values for LOC/Method Data: ");
		System.out.print("Very Small: " + decimalFormat.format(locPerMethodSizeRange.getVerySmallSizeRange()));
		System.out.print("\t\tSmall: " + decimalFormat.format(locPerMethodSizeRange.getSmallSizeRange()));
		System.out.print("\t\tMedium: " + decimalFormat.format(locPerMethodSizeRange.getMediumSizeRange()));
		System.out.print("\t\tLarge: " + decimalFormat.format(locPerMethodSizeRange.getLargeSizeRange()));
		System.out.print("\t\tVery Large: " + decimalFormat.format(locPerMethodSizeRange.getVeryLargeSizeRange()));
		

		CustomLinkedList pgsPerChapter = new CustomLinkedList();
		
		pgsPerChapter.addNode(new double[]{7.00, 12.00, 10.00, 12.00, 10.00, 12.00, 12.00, 12.00, 12.00, 8.00, 8.00, 8.00, 20.00, 14.00, 18.00, 12.00});
		
		SizeRange pagerPerChapterSizeRange = CalculateUtil.relativeSizeRange(pgsPerChapter);
		
		System.out.println("\n\nValues for Pgs/Chapter Data: ");
		System.out.print("Very Small: " + decimalFormat.format(pagerPerChapterSizeRange.getVerySmallSizeRange()));
		System.out.print("\t\tSmall: " + decimalFormat.format(pagerPerChapterSizeRange.getSmallSizeRange()));
		System.out.print("\t\tMedium: " + decimalFormat.format(pagerPerChapterSizeRange.getMediumSizeRange()));
		System.out.print("\t\tLarge: " + decimalFormat.format(pagerPerChapterSizeRange.getLargeSizeRange()));
		System.out.print("\t\tVery Large: " + decimalFormat.format(pagerPerChapterSizeRange.getVeryLargeSizeRange()));
		
	}
	// METHOD END
}
// CLASS END
package PSP.ProgramThree;

import java.text.DecimalFormat;

/*
 * Program Assignment: PSP assignment 3                                                     
 * Name: Thiago Inocêncio
 * Date: 30/03/2017 
 * Description: The main class of the PSP's third program
 */

// CLASS BEGIN: Main
public class Main {

	// METHOD BEGIN: main
	public static void main(String args[]) {
		
	double[] estimatedProxySize = new double[]{130.00, 650.00, 99.00, 150.00, 128.00, 302.00, 95.00, 945.00, 368.00, 961.00};
	double[] actualAddedAndModifiedSize = new double[]{186.00, 699.00, 132.00, 272.00, 291.00, 331.00, 199.00, 1890.00, 788.00, 1601.00};
	double[] actualDevelopmentHours = new double[]{15.00, 69.90, 6.50, 22.40, 28.40, 65.90, 19.40, 198.70, 38.80, 138.20};
	double[] planAddedAndModifiedSize = new double[]{163.00, 765.00, 141.00, 166.00, 137.00, 355.00, 136.00, 1206.00, 433.00, 1130.00};
	
	
	DecimalFormat decimalFormat = new DecimalFormat("#.######");
	
	OrderedPair teste1 = new OrderedPair(estimatedProxySize, actualAddedAndModifiedSize);
	
	System.out.println("Test 1: \n");
	System.out.print("B0: " + decimalFormat.format(LinearRegression.calculateBeta0(teste1)) + "\t");
	System.out.print("B1: " + decimalFormat.format(LinearRegression.calculateBeta1(teste1)) + "\t");
	System.out.print("R: " + decimalFormat.format(LinearRegression.calculateR(teste1)) + "\t");	
	System.out.print("R^2: " + decimalFormat.format(LinearRegression.calculateBetaRSquared(teste1)) + "\t");	
	System.out.print("estimating of 386,00: Yk = " + decimalFormat.format(LinearRegression.calculatePrediction(teste1, 386.00)));
	
	
	
	OrderedPair teste2 = new OrderedPair(estimatedProxySize, actualDevelopmentHours);
	
	System.out.println("\n\nTest 2: \n");
	System.out.print("B0: " + decimalFormat.format(LinearRegression.calculateBeta0(teste2)) + "\t");
	System.out.print("B1: " + decimalFormat.format(LinearRegression.calculateBeta1(teste2)) + "\t");
	System.out.print("R: " + decimalFormat.format(LinearRegression.calculateR(teste2)) + "\t");	
	System.out.print("R^2: " + decimalFormat.format(LinearRegression.calculateBetaRSquared(teste2)) + "\t");	
	System.out.print("estimating of 386,00: Yk = " + decimalFormat.format(LinearRegression.calculatePrediction(teste2, 386.00)));
	
	OrderedPair teste3 = new OrderedPair(planAddedAndModifiedSize, actualAddedAndModifiedSize);
	
	System.out.println("\n\nTest 3: \n");
	System.out.print("B0: " + decimalFormat.format(LinearRegression.calculateBeta0(teste3)) + "\t");
	System.out.print("B1: " + decimalFormat.format(LinearRegression.calculateBeta1(teste3)) + "\t");
	System.out.print("R: " + decimalFormat.format(LinearRegression.calculateR(teste3)) + "\t");	
	System.out.print("R^2: " + decimalFormat.format(LinearRegression.calculateBetaRSquared(teste3)) + "\t");	
	System.out.print("estimating of 386,00: Yk = " + decimalFormat.format(LinearRegression.calculatePrediction(teste3, 386.00)));
	
	OrderedPair teste4 = new OrderedPair(planAddedAndModifiedSize, actualDevelopmentHours);
	
	System.out.println("\n\nTest 4: \n");
	System.out.print("B0: " + decimalFormat.format(LinearRegression.calculateBeta0(teste4)) + "\t");
	System.out.print("B1: " + decimalFormat.format(LinearRegression.calculateBeta1(teste4)) + "\t");
	System.out.print("R: " + decimalFormat.format(LinearRegression.calculateR(teste4)) + "\t");	
	System.out.print("R^2: " + decimalFormat.format(LinearRegression.calculateBetaRSquared(teste4)) + "\t");	
	System.out.print("estimating of 386,00: Yk = " + decimalFormat.format(LinearRegression.calculatePrediction(teste4, 386.00)));
		
	}
	// METHOD END
	
}
//CLASS END

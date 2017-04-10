package PSP.ProgramThree;

/*
 * Program Assignment: PSP assignment 3                                                     
 * Name: Thiago Inocêncio
 * Date: 30/03/2017 
 * Description: A class that has useful methods to calculate a linear regression from an given orderned pair 
 */

// CLASS BEGIN: LinearRegression
public class LinearRegression {
	
	/*
	 *    Reuse instructions
	 *    double calculateBeta0(OrderedPair orderedPair)
	 *    Purpose: to calculate the linear regression parameter beta 0 of a given orderedPair   
	 *    Limitations: the given ordered pair must have at least one pair
	 *    Return: A double value that contain the linear regression parameter beta 0 of the given ordered pair.
	 */
	// METHOD BEGIN: calculateBeta0
	public static double calculateBeta0(OrderedPair orderedPair) {
		
		double beta1 = LinearRegression.calculateBeta1(orderedPair);

		double beta0 = orderedPair.getMeanOf_Y_Values() - (beta1 * orderedPair.getMeanOf_X_Values());
		
		return beta0;
	}
	// METHOD END
	
	/*
	 *    Reuse instructions
	 *    double calculateBeta1(OrderedPair orderedPair)
	 *    Purpose: to calculate the linear regression parameter beta 1 of a given orderedPair     
	 *    Limitations: the given ordered pair must have at least one pair
	 *    Return: A double value that contain the linear regression parameter beta 1 of the given ordered pair.
	 */
	// METHOD BEGIN: calculateBeta1
	public static double calculateBeta1(OrderedPair orderedPair) {
		
		double b1;
		int numberOfValues = orderedPair.getData().getNumberOfNodes();
		
		b1 = orderedPair.getSumOf_X_Plus_Y_Values() - (numberOfValues * orderedPair.getMeanOf_X_Values() * orderedPair.getMeanOf_Y_Values());
		
		b1 = b1 / (orderedPair.getSumOf_X_SquaredValues() - (numberOfValues * Math.pow(orderedPair.getMeanOf_X_Values(), 2)));
		
		return b1;
	}
	// METHOD END
	
	/*
	 *    Reuse instructions
	 *    double calculateR(OrderedPair orderedPair).
	 *    Purpose: to calculate the correlation coefficient r of a given ordered pair.     
	 *    Limitations: the given ordered pair must have at least one pair.
	 *    Return: A double value that contain the correlation coefficient r of the given ordered pair.
	 */
	// METHOD BEGIN: calculateR
	public static double calculateR(OrderedPair orderedPair) {
		
		double rValue, rNumerator, rDenominator;
		int numberOfValues = orderedPair.getData().getNumberOfNodes();
		
		rNumerator = (numberOfValues * orderedPair.getSumOf_X_Plus_Y_Values());
		
		rNumerator = rNumerator - (orderedPair.getSumOf_X_Values() * orderedPair.getSumOf_Y_Values());
		
		rDenominator = (numberOfValues * orderedPair.getSumOf_X_SquaredValues());
		
		rDenominator = rDenominator - (Math.pow(orderedPair.getSumOf_X_Values(), 2));
		
		rDenominator = rDenominator * ((numberOfValues * orderedPair.getSumOf_Y_SquaredValues()) - (Math.pow(orderedPair.getSumOf_Y_Values(), 2)));
		
		rDenominator = Math.sqrt(rDenominator);
		
		rValue = rNumerator / rDenominator;
	
		return rValue;
	}
	// METHOD END
	
	/*
	 *    Reuse instructions
	 *    double calculateBetaRSquared(OrderedPair orderedPair)
	 *    Purpose: to calculate the correlation coefficient r^2 of a given ordered pair. 
	 *    Limitations: the given ordered pair must have at least one pair
	 *    Return: A double value that contain the r coeficient of the given ordered pair.
	 */
	// METHOD BEGIN: calculateBetaRSquared
	public static double calculateBetaRSquared(OrderedPair orderedPair) {
		
		double rValue = LinearRegression.calculateR(orderedPair);
		
		return rValue * rValue;
	}
	// METHOD END
	
	/*
	 *    Reuse instructions
	 *    double calculatePrediction(OrderedPair orderedPair, double estimateProxy)
	 *    Purpose: to calculate an improved prediction yk (yKValue) given an estimate Xk (estimateProxy) where yk = b0 + b1* Xk. 
	 *    Limitations: the given ordered pairs must have at least one pair
	 *    Return: A double value that contain improved prediction yk..
	 */
	// METHOD BEGIN: calculatePrediction
	public static double calculatePrediction(OrderedPair orderedPair, double estimateProxy) {
		
		double yKValue;
		
		yKValue = LinearRegression.calculateBeta0(orderedPair) + (LinearRegression.calculateBeta1(orderedPair) * estimateProxy);
		
		return yKValue;
	}
	// METHOD END
}
//CLASS END
package PSP.ProgramFour;

/*
 * Program Assignment: PSP assignment 4                                                    
 * Name: Thiago Inocêncio
 * Date: 05/04/2017 
 * Description:  A class that hold a CustomLinkedList object and its relative size range values
 */

// CLASS BEGIN: SizeRange
public class SizeRange {

	private CustomLinkedList data;
	private double verySmallSizeRange;
	private double smallSizeRange;
	private double mediumSizeRange;
	private double largeSizeRange;
	private double veryLargeSizeRange;
	
	/*
	 *    The following methods are used to encapsulate the attributes of this class                                                                 
	 */
	
	// METHOD BEGIN: getData
	public CustomLinkedList getData() {
		return data;
	}
	// METHOD END
	
	// METHOD BEGIN: setData
	public void setData(CustomLinkedList data) {
		this.data = data;
	}
	// METHOD END

	// METHOD BEGIN: getVerySmallSizeRange
	public double getVerySmallSizeRange() {
		return verySmallSizeRange;
	}
	// METHOD END

	// METHOD BEGIN: setVerySmallSizeRange
	public void setVerySmallSizeRange(double verySmallSizeRange) {
		this.verySmallSizeRange = verySmallSizeRange;
	}
	// METHOD END

	// METHOD BEGIN: getSmallSizeRange
	public double getSmallSizeRange() {
		return smallSizeRange;
	}
	// METHOD END

	// METHOD BEGIN: setSmallSizeRange
	public void setSmallSizeRange(double smallSizeRange) {
		this.smallSizeRange = smallSizeRange;
	}
	// METHOD END

	// METHOD BEGIN: getMediumSizeRange
	public double getMediumSizeRange() {
		return mediumSizeRange;
	}
	// METHOD END

	// METHOD BEGIN: setMediumSizeRange
	public void setMediumSizeRange(double mediumSizeRange) {
		this.mediumSizeRange = mediumSizeRange;
	}
	// METHOD END

	// METHOD BEGIN: getLargeSizeRange
	public double getLargeSizeRange() {
		return largeSizeRange;
	}
	// METHOD END

	// METHOD BEGIN: setLargeSizeRange
	public void setLargeSizeRange(double largeSizeRange) {
		this.largeSizeRange = largeSizeRange;
	}
	// METHOD END

	// METHOD BEGIN: getVeryLargeSizeRange
	public double getVeryLargeSizeRange() {
		return veryLargeSizeRange;
	}
	// METHOD END

	// METHOD BEGIN: setVeryLargeSizeRange
	public void setVeryLargeSizeRange(double veryLargeSizeRange) {
		this.veryLargeSizeRange = veryLargeSizeRange;
	}
	// METHOD END
	
}
//CLASS END
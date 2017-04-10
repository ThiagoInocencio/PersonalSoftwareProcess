package PSP.ProgramTwo;

/*
 * Program Assignment: PSP assignment 2                                                     
 * Name: Thiago Inocêncio
 * Date: 23/03/2017 
 * Description:  Abstract class ComposedPart
 */

// CLASS BEGIN: ComposedPart
public abstract class ComposedPart extends Part {
	
	private int numberOfItens;
	
	// Abstract methods that must be implemented in the child classes
	public abstract void calculateSize();
	public abstract void calculateNumberOfItens();
	public abstract void resumePart();
	
	/*
	 *    The following methods is used to encapsulate the attributes of this class                                                                 
	 */

	// METHOD BEGIN: getNumberOfItens
	public int getNumberOfItens() {
		return numberOfItens;
	}
	// METHOD END

	// METHOD BEGIN: setNumberOfItens
	public void setNumberOfItens(int numberOfItens) {
		this.numberOfItens = numberOfItens;
	}
	// METHOD END
}
// CLASS END
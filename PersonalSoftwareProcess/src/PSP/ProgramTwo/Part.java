package PSP.ProgramTwo;

import java.util.ArrayList;

/*
 * Program Assignment: PSP assignment 2                                                   
 * Name: Thiago Inocêncio
 * Date: 30/03/2017 
 * Description:  Abstract class Part
 */

// CLASS BEGIN: Part
public abstract class Part {
	private int partSize;
	private String partName;
	private ArrayList<String> partContent = new ArrayList<>();
	
	// Abstract methods that must be implemented in the child classes
	public abstract void calculateSize();
	public abstract void showCounting();

	/*
	 *    The following methods is used to encapsulate the attributes of this class                                                                 
	 */
	
	// METHOD BEGIN: getPartSize
	public int getPartSize() {
		return partSize;
	}
	// METHOD END

	// METHOD BEGIN: setPartSize
	public void setPartSize(int partSize) {
		this.partSize = partSize;
	}
	// METHOD END

	// METHOD BEGIN: getPartName
	public String getPartName() {
		return partName;
	}
	// METHOD END

	// METHOD BEGIN: setPartName
	public void setPartName(String partName) {
		this.partName = partName;
	}
	// METHOD END

	// METHOD BEGIN: getPartContent
	public ArrayList<String> getPartContent() {
		return partContent;
	}
	// METHOD END

	// METHOD BEGIN: setPartContent
	public void setPartContent(ArrayList<String> partContent) {
		this.partContent = partContent;
	}
	// METHOD END

}
// CLASS END

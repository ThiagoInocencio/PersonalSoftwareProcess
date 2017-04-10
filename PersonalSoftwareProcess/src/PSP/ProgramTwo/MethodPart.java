package PSP.ProgramTwo;

/*
 * Program Assignment: PSP assignment 2                                                    
 * Name: Thiago Inocêncio
 * Date: 30/03/2017 
 * Description:  A class that encapsulates a method's content
 */

// CLASS BEGIN: MethodPart
public class MethodPart extends Part {

	// METHOD BEGIN: calculateSize
	@Override
	public void calculateSize() {
		int countSize = 0;
		
		for(String line : this.getPartContent()) {
			if(line.replace("\t", "").equals("")) 
				continue;
			else 
				if(line.replace("\t", "").replace(" ", "").startsWith("//")) 
					continue;
			else 
				if(line.replace("\t", "").replace(" ", "").startsWith("/*")) 
					continue;
			else 
				if(line.replace("\t", "").replace(" ", "").startsWith("*")) 
					continue;
			else 
				if(line.replace("\t", "").replace(" ", "").startsWith("*/"))
					continue;
			
			countSize++;
		}
		
		this.setPartSize(countSize);
	}
	// METHOD END

	// METHOD BEGIN: showCounting
	@Override
	public void showCounting() {
		
		System.out.println("\t\t\tPartName: " + this.getPartName() + " (Method)");
		System.out.println("\t\t\tSize of "+ this.getPartName() + " (Method) : " + this.getPartSize() + " LOC(s)\n");
		
	}
	// METHOD END

}
// CLASS END
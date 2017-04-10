package PSP.ProgramTwo;

import java.util.ArrayList;

/*
 * Program Assignment: PSP assignment 2                                                    
 * Name: Thiago Inocêncio
 * Date: 23/03/2017 
 * Description:  A class that encapsulates  a class's content and MethodParts
 */

// CLASS BEGIN: ClassPart
public class ClassPart extends ComposedPart {
	
	private ArrayList<MethodPart> partsMethod = new ArrayList<>();

	// METHOD BEGIN: calculateSize
	@Override
	public void calculateSize() {
		
		int countSize = 1;
		
		for(MethodPart partMethod : this.partsMethod)
			countSize += partMethod.getPartSize();
		
		for(String line : this.getPartContent()) {
			
			if(line.contains("METHOD BEGIN:")) break;
			
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
	
	// METHOD BEGIN: calculateNumberOfItens
	@Override
	public void calculateNumberOfItens() {
		this.setNumberOfItens(this.getPartsMethod().size());
	}
	// METHOD END
	
	// METHOD BEGIN: resumePart
	@Override
	public void resumePart() {
		
		ArrayList<String> classCode = this.getPartContent();

		String line;
		ArrayList<String> methodCode;
		int methodBeginLine = 0;
		int methodEndLine = 0;
		String methodName = "";

		for(int countLine = 0; countLine < classCode.size(); countLine++)  {
				
				line = classCode.get(countLine).toString();
				
				if(line.replace("\t", "").replace(" ", "").startsWith("//") && line.contains("METHOD BEGIN:")) {
					methodBeginLine = countLine + 1;
					methodName = line.substring(18, line.length());
				}
				
				if(line.replace("\t", "").replace(" ", "").startsWith("//") && line.contains("METHOD END")) {
					methodEndLine = countLine;
					
					methodCode = new ArrayList<String>(classCode.subList(methodBeginLine, methodEndLine));
					
					MethodPart methodPart = new MethodPart();
					
					methodPart.setPartContent(methodCode);
						
					methodPart.setPartName(methodName);
					
					methodPart.calculateSize();
						
					// Adding a new MethodPart to this ClassPart
					this.partsMethod.add(methodPart);
					
					// reset the lines variables values to start to count new PartMethods
					methodBeginLine = 0;
					methodEndLine = 0;
					methodName = "";
					
				}
		}
		
		this.calculateSize();
		this.calculateNumberOfItens();
		
	}
	// METHOD END

	// METHOD BEGIN: getPartsMethod
	public ArrayList<MethodPart> getPartsMethod() {
		return partsMethod;
	}
	// METHOD END

	// METHOD BEGIN: setPartsMethod
	public void setPartsMethod(ArrayList<MethodPart> partsMethod) {
		this.partsMethod = partsMethod;
	}
	// METHOD END

	// METHOD BEGIN: showCounting
	@Override
	public void showCounting() {
		
		System.out.println("\t\tPartName: " + this.getPartName() + " (Class)");
		System.out.println("\t\tNumber of Itens: " + this.getNumberOfItens() + "\n");
		
		for(MethodPart methodPart : this.getPartsMethod()) 
			methodPart.showCounting();
		
		System.out.println("\t\tSize of "+ this.getPartName() + " (Class) : " + this.getPartSize() + " LOC(s)\n");
	}
	// METHOD END
}
// CLASS END
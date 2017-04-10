package PSP.ProgramTwo;

import java.util.ArrayList;

/*
 * Program Assignment: PSP assignment 2                                                     
 * Name: Thiago Inocêncio
 * Date: 30/03/2017 
 * Description: A class that encapsulates java's files and an Array List of ClassParts
 */

// CLASS BEGIN: JavaPart
public class JavaPart extends ComposedPart {

	private ArrayList<ClassPart> partsClass = new ArrayList<>();
	
	// METHOD BEGIN: calculateSize
	@Override
	public void calculateSize() {
		int countSize = 0;
		
		for(ClassPart classPart : this.partsClass)
			countSize += classPart.getPartSize();
		
		for(String line : this.getPartContent()) {
			
			if(line.contains("CLASS BEGIN:")) break;
			
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
		
		int numberOfItens = 1;
		
		for(ClassPart classPart : this.partsClass) 
			numberOfItens += classPart.getNumberOfItens();
		
		this.setNumberOfItens(numberOfItens);
	}
	// METHOD END
	
	// METHOD BEGIN: resumePart
	@Override
	public void resumePart() {
		
		ArrayList<String> javaCode = this.getPartContent();

		String line;
		ArrayList<String> classCode;
		int classBeginLine = 0;
		int classEndLine = 0;
		String className = "";

		for(int countLine = 0; countLine < javaCode.size(); countLine++)  {
				
				line = javaCode.get(countLine).toString();
				
				if(line.replace("\t", "").replace(" ", "").startsWith("//") && line.contains("CLASS BEGIN:")) {
					classBeginLine = countLine + 1;
					className = line.substring(16, line.length());
				}
				
				if(line.replace("\t", "").replace(" ", "").startsWith("//") && line.contains("CLASS END")) {
					classEndLine = countLine;
				}
				
		}
		
		classCode = new ArrayList<String>(javaCode.subList(classBeginLine, classEndLine));
			
		ClassPart classPart = new ClassPart();
				
		classPart.setPartContent(classCode);
				
		classPart.setPartName(className);
				
		// Adding a new ClassPart to this JavaPart
		this.partsClass.add(classPart);
			
		classPart.resumePart();
			
		// Calculating the size of this JavaPart
		this.calculateSize();
		this.calculateNumberOfItens();
				
	} 
	// METHOD END
	
	// METHOD BEGIN: getPartsClass
	public ArrayList<ClassPart> getPartsClass() {
		return partsClass;
	}
	// METHOD END
	

	// METHOD BEGIN: setPartsClass
	public void setPartsClass(ArrayList<ClassPart> partsClass) {
		this.partsClass = partsClass;
	}
	// METHOD END

	// METHOD BEGIN: showCounting
	@Override
	public void showCounting() {
		
		String partName = this.getPartName();
		
		if(partName.contains("\\"))
			partName = partName.substring(partName.lastIndexOf("\\")+ 1, partName.length());
		
		System.out.println("\tPartName: " + partName + (" (Java File)"));
		System.out.println("\tNumber of Itens: " + this.getNumberOfItens() + "\n");
		
		for(ClassPart classPart : this.getPartsClass()) 
				classPart.showCounting();
		
		System.out.println("\tSize of "+ partName + " : " + this.getPartSize() + " LOC(s)\n");
		System.out.println("\t****************************************************\n");
	}
	// METHOD END
}
// CLASS END

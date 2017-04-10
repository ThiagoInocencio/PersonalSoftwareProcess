package PSP.ProgramTwo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Program Assignment: PSP assignment 2                                                  
 * Name: Thiago Inocêncio
 * Date: 23/03/2017 
 * Description:  A class that encapsulates a entire program's files code.
 */

// CLASS BEGIN: ProgramPart
public class ProgramPart extends ComposedPart {

	private ArrayList<JavaPart> partsJava = new ArrayList<>();
	
	// METHOD BEGIN: calculateSize
	@Override
	public void calculateSize() {
		int countSize = 0;
		
		for(JavaPart javaPart : this.partsJava)
			countSize += javaPart.getPartSize();
		
		this.setPartSize(countSize);
	}
	// METHOD END
	
	// METHOD BEGIN: calculateNumberOfItens
	@Override
	public void calculateNumberOfItens() {
		
		int numberOfItens = 0;
		
		for(JavaPart javaPart : this.partsJava)
			numberOfItens += javaPart.getNumberOfItens();
		
		
		this.setNumberOfItens(numberOfItens);
	}
	// METHOD END
	
	// METHOD BEGIN: resumePart
	@Override
	public void resumePart() {
		
		for(int i = 0; i < partsJava.size(); i++)  {
			
			try (BufferedReader fileReader = new BufferedReader(new FileReader(partsJava.get(i).getPartName()))) {
				
				String line;
				ArrayList<String> javaCode = new ArrayList<>();
				
				while((line = fileReader.readLine()) != null)
					javaCode.add(line);
				
				this.partsJava.get(i).setPartContent(javaCode);
				
				this.partsJava.get(i).resumePart();
				
			} catch(IOException exc) {
				
			} 
			
		}
		
		calculateSize();
		calculateNumberOfItens();
		
	}
	// METHOD END
	
	// METHOD BEGIN: showCounting
	@Override
	public void showCounting() {
		
		System.out.println("Program Name: " + this.getPartName());
		System.out.println("Number of Itens: " + this.getNumberOfItens() + "\n");
	
		for(JavaPart javaPart : this.getPartsJava()) 
					javaPart.showCounting();
		
		System.out.println("Total Size of "+ this.getPartName() + " : " + this.getPartSize() + " LOC");
		System.out.println("\n\n*************************************************************************\n\n");
		
	}
	// METHOD END

	// METHOD BEGIN: getPartsJava
	public ArrayList<JavaPart> getPartsJava() {
		return partsJava;
	}
	// METHOD END

	// METHOD BEGIN: setPartsJava
	public void setPartsJava(ArrayList<JavaPart> partsJava) {
		this.partsJava = partsJava;
	}
	// METHOD END
}
// CLASS END
package PSP.ProgramTwo;

/*
 * Program Assignment: PSP assignment 2                                                    
 * Name: Thiago Inocêncio
 * Date: 23/03/2017 
 * Description:  The main class of the PSP's second program
 */

// CLASS BEGIN: Main
public class Main {

	// METHOD BEGIN: main
	public static void main(String[] args) {
		
		
		// Test for PSP program One
		String[] programOneFiles = {"C:\\Users\\Thiago\\Desktop\\PSP\\PersonalSoftwareProcess\\src\\PSP\\NewProgramOne\\CalculateUtil.java", 
								    "C:\\Users\\Thiago\\Desktop\\PSP\\PersonalSoftwareProcess\\src\\PSP\\NewProgramOne\\CustomLinkedList.java", 
								    "C:\\Users\\Thiago\\Desktop\\PSP\\PersonalSoftwareProcess\\src\\PSP\\NewProgramOne\\Main.java", 
									"C:\\Users\\Thiago\\Desktop\\PSP\\PersonalSoftwareProcess\\src\\PSP\\NewProgramOne\\Node.java"};
		
		ProgramPart programPart = new ProgramPart();
		programPart.setPartName("ProgramOne");
		
		for(int i = 0; i < programOneFiles.length; i++) {
			JavaPart newJavaPart = new JavaPart();
			
			newJavaPart.setPartName(programOneFiles[i]);
			
			programPart.getPartsJava().add(newJavaPart);
			
		}
		
		programPart.resumePart();
		programPart.showCounting();
		
		// Test for PSP program Two
		String[] programTwoFiles = {"C:\\Users\\Thiago\\Desktop\\PSP\\PersonalSoftwareProcess\\src\\PSP\\ProgramTwo\\ClassPart.java",
									"C:\\Users\\Thiago\\Desktop\\PSP\\PersonalSoftwareProcess\\src\\PSP\\ProgramTwo\\ComposedPart.java",
									"C:\\Users\\Thiago\\Desktop\\PSP\\PersonalSoftwareProcess\\src\\PSP\\ProgramTwo\\JavaPart.java",
									"C:\\Users\\Thiago\\Desktop\\PSP\\PersonalSoftwareProcess\\src\\PSP\\ProgramTwo\\Main.java",
									"C:\\Users\\Thiago\\Desktop\\PSP\\PersonalSoftwareProcess\\src\\PSP\\ProgramTwo\\MethodPart.java",
									"C:\\Users\\Thiago\\Desktop\\PSP\\PersonalSoftwareProcess\\src\\PSP\\ProgramTwo\\Part.java",
									"C:\\Users\\Thiago\\Desktop\\PSP\\PersonalSoftwareProcess\\src\\PSP\\ProgramTwo\\ProgramPart.java"};

		ProgramPart programTwoPart = new ProgramPart();
		programTwoPart.setPartName("ProgramTwo");
		
		for(int i = 0; i < programTwoFiles.length; i++) {
		JavaPart newJavaPart = new JavaPart();
		
		newJavaPart.setPartName(programTwoFiles[i]);
		
		programTwoPart.getPartsJava().add(newJavaPart);
		
		}
		
		programTwoPart.resumePart();
		programTwoPart.showCounting();
				

	}
	// METHOD END

}
// CLASS END
package Week05;

public class SpacedLogger implements Logger {							//Created a class that implements the Logger interface

	@Override
	public void log(String log) {										//unimplemented method created from Logger interface
		
		StringBuilder addSpace = new StringBuilder();					//created a StringBuilder called addSpace
		for (int i = 0; i < log.length(); i++) {						//used a for loop to iterate through the length of the log argument and append a space in between each character in the argument
			addSpace.append(log.charAt(i)).append(" ");
		}
		System.out.println(addSpace.toString().trim());					//printed the string and used trim to remove space from the end of the print line
	}

	@Override
	public void error(String error) {
		
		StringBuilder addSpace2 = new StringBuilder();							//used a for loop to iterate through the length of the log argument and append a space in between each character in the argument
		for (int i = 0; i < error.length(); i++) {
			addSpace2.append(error.charAt(i)).append(" ");
		}
		
		System.out.println("ERROR: " + addSpace2.toString().trim());		//Added the word ERROR in quotes to print prior to the error argument and then printed the string, used trim to remove space from the end of the print line
	}

}

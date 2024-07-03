package Week05;

public class AsteriskLogger implements Logger{							//Created a class that implements the Logger interface

	@Override
	public void log(String log) {										//Method log with a variable of String
		
		System.out.println("***" + log + "***");						//Adding the asterisk symbol surrounding the argument log 

	}
	

	@Override
	public void error(String error) {									//utilized a StringBuilder and for loop to append the asterisk symbol 
		StringBuilder asterickError = new StringBuilder();				
		
		int totalLine = 12 + error.length() + 3;						//iterated through the variable totalLine, the 12 and 3 are used for adding the * to what prints to the console
		for (int i = 0; i < totalLine; i++) {					
			asterickError.append("*");
		}
		
		System.out.println(asterickError);								//printing out the asterickError StringBuilder above and below the error message to surround the argument "error" in a box of asterisks
		System.out.println("***Error: " + error + "***");
		System.out.println(asterickError);
		
	}

	
	
}

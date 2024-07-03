package Week05;

public class App {														//created a class called App with a main method

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();					//instantiated each class implementing the Logger interface
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("This is awesome!");							//testing the methods to ensure the formatting is correct and will print whatever we pass into our message
		asteriskLogger.error("Oh no! What happened?");
		
		spacedLogger.log("Sweet!");
		spacedLogger.error("No way!");
	}

}

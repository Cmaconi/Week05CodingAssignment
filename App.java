package Week05;

public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("This is awesome!");
		asteriskLogger.error("Oh no! What happened?");
		
		spacedLogger.log("Sweet!");
		spacedLogger.error("No way!");
	}

}

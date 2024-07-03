package Week05;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		
		System.out.println("***" + log + "***");
		//log = "Hello";
		//StringBuilder asterickSymbol = new StringBuilder();
		//for (int i = 0; i < 3; i++) {
			//asterickSymbol.append("*");
		//}
		//asterickSymbol.append(log);
		
		//for (int i = 0; i < 3; i++) {
			//asterickSymbol.append("*");
		//}
		//System.out.println(asterickSymbol.toString());
	}
	

	@Override
	public void error(String error) {
		StringBuilder asterickError = new StringBuilder();
		//error = "Hello";
		int totalLine = 12 + error.length() + 3;
		for (int i = 0; i < totalLine; i++) {
			asterickError.append("*");
		}
		
		System.out.println(asterickError);
		System.out.println("***Error: " + error + "***");
		System.out.println(asterickError);
		
	}

	
	
}

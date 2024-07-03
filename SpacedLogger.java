package Week05;

import java.util.Date;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		Date date = new Date();
		
		StringBuilder addSpace = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			addSpace.append(log.charAt(i)).append(" ");
		}
		System.out.println(addSpace.toString().trim());
	}

	@Override
	public void error(String error) {
		Date date = new Date();
		StringBuilder addSpace2 = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			addSpace2.append(error.charAt(i)).append(" ");
		}
		
		System.out.println("ERROR: " + addSpace2.toString().trim());
	}

}

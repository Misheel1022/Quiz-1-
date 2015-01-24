import java.util.Scanner;
public class IputOutput {

	public static void main(String[] args) {
		String username, password;
		
	Scanner keyboard = new Scanner(System.in);	
	System.out.println("Enter your username");
	username = keyboard.next();
	System.out.println("Enter your password");
	password = keyboard.next();
	
	System.out.println("Hello " + username + " Welcome to CCS200 class! "
				+  "and your password is " + password);
	}

}

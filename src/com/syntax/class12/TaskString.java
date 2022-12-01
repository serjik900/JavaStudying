package com.syntax.class12;

import java.util.Scanner;

public class TaskString {

	public static void main(String[] args) {
		/*Store username, password and confirm password from a user and check following requirements:
Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
		 * 
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your userName");
		
		String userName=in.nextLine();
		System.out.println("Please enter the password");
		
		String password=in.next();
		
		String confirmPassword="pass123";
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("UserName and password can`t be empty");
		}else if(password.length()<8) {
			System.out.println("Password is too short");
		}
		else if(userName.contains(password)) {
			System.out.println("Password cannot contain username");
		}else if(!password.equals(confirmPassword)){
			System.out.println("Password doesn`t match");
		}else {
			System.out.println("Your username and password has created");
		}

	}

}

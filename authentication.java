//Write a user defined exception class to authenticate the user name and password.


import java.util.Scanner;

public class authentication {
	public static class credentialexception extends Exception{
		public credentialexception(){
			super("Invalid credentials");
		}
	}

    public static void main(String[] args) {
        String username = "user";
        String password = "user123";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Username");
        String u1 = sc.nextLine();
        System.out.println("Enter the Password");
        String u2 = sc.nextLine();
        try {
            if ((u1.equals(username)) && (u2.equals(password))) {
                System.out.println("Acess Granted");
            }
            else  {
                throw  new credentialexception();
            }
        }
        catch (credentialexception e){
            System.out.println(e.getMessage());

        }


}}
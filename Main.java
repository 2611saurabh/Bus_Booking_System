package detail;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("**************************************************");
		System.out.println("Welcome to Bus Reservation System");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Press 1 for making id");
		System.out.println("Press 2 login");
		System.out.println("Press 3 for getting user detail");
		System.out.println("Press 4 for getting bus detail");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("name + phone + email + street + city + state + Password");
			String username=sc.nextLine();
			Long phone=sc.nextLong();
			String email=sc.nextLine();
			String street=sc.nextLine();
			String city=sc.nextLine();
			String state=sc.nextLine();
			String password=sc.nextLine();
			
			LoginSignup login=new LoginSignup();
			System.out.println(login.signup(username, phone, email, street, city, state, password));
			
		}
		if(choice==2)
		{
			LoginSignup loginn=new LoginSignup();
			String emaiil=sc.nextLine();
			String passsword=sc.nextLine();
			System.out.println(loginn.Login(emaiil, passsword));
		}
		if(choice==3)
		{
			UserOperation userOperation=new UserOperation();
			String emaill=sc.nextLine();
			System.out.println(userOperation.finduser(emaill));

		}
	
		
		
//		System.out.println(loginSignup.signup("Saurabh Kumar", 914033605, "saurabh.kr026@gmail.com", "bhagwanpur", "varanasi", "UP","123456789"));
//		System.out.println(loginSignup.signup("Harshul", 9140605, "harhul0736@gmail.com", "Nazibabad", "Meerut", "UP","12345"));
//		System.out.println(loginSignup.signup("Gaurav", 9140336, "gaurav@gmail.com", "bhagwanpur", "varanasi", "UP","56789"));
//		System.out.println(loginSignup.Login("saurabh.kr026@gmail.com", "123456789"));
//		
//		UserOperation userOperation=new UserOperation();
//		System.out.println(userOperation.finduser("gaurav@gmail.com"));
//		
//		userOperation.updateuser("gaurav@gmail.com", "Kush");
//		System.out.println(userOperation.finduser("gaurav@gmail.com"));
	}

}

package detail;

public class LoginSignup {
UserOperation userOperation=new UserOperation();
	
	public String signup(String name,long phone,String email,String street,String city,String state,String password)
	{
		if(userOperation.verifyEmail(email))
		{
			return "Email all ready taken";
		}
		Contact contact=new Contact(name,phone,email);
		Address address=new Address(street,city,state);
	
		User user=new User(contact,address,password);
		userOperation.addUser(user);
		return "Signup";
	}
	public String Login(String email,String password)
	
	{
		if(!userOperation.verifyEmail(email))
			return "Incorrect email";
		if(!userOperation.verifyPassword(password))
			return "Incorrect Password";
		return "Login Successfull";
	}

}

public class User {
	
	public String first_name;
	public String last_name;
	public String email;
	
	public User (String passed_first_name,  String passed_last_name, String passed_email) {
		first_name 	= passed_first_name;
		last_name 	= passed_last_name;
		email		= passed_email;	
	}
	
	public User () {
	}
	
	public String full_name() {
		String full_name = first_name + " " + last_name;
		return full_name;
	}
	
}
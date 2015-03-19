public class Defect {
	
	public String status;
	public int priority;
	public User assignee;
	public String summary;
	public String description;
	
	public Defect (String p_status,  int p_priority, User p_assignee, String p_summary, String p_description) {
		status 		= p_status;
		priority 	= p_priority;
		assignee	= p_assignee;	
		summary		= p_summary;
		description	= p_description;
	}
	
	public Defect () {
	}
	
	public void all_open_defects() {
		
	}
	
	public void email_status() {
		// What is our expectation, are we suppose to set up email server and fire off an email?
	}
	
	public void update_status(String p_status) {
		
	}
	
	public void update_priority(String p_priority) {
		
	}
	
	public void assign_to_user(User p_user) {
		
	}
	
	
	
	
	
}
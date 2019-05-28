
public class Employee {
	
	private int empId;
	private String username;
	private String first_name;
	private String last_name;
	private String email;
	
	public Employee(int empId, String username, String first_name, String last_name, String email) {
		this.empId = empId;
		this.username = username;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		
	}

	

	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	//---
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	//---
	
	public String getFirst_name() {
		return first_name;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	//---
	
	public String getLast_name() {
		return last_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	//---
	
	public String getEmail() {
		return email;
		
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//---
	
	public String toString () {
		
		String tabx10 = "\t\t\t\t\t\t\t\t\t\t";
		
		
		String output = Integer.toString(empId) + "  " +  username + "\t\t\t" + first_name + tabx10
				+ last_name + tabx10 + email; 
		
		
		//System.out.printf("%-10s %10s %10s %10 %10s", Integer.toString(getEmpId()), getUsername(), first_name, last_name, email);
		
		return output;
	
	}
}
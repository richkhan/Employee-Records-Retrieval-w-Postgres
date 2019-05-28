import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class RecordRetrieval {
	public static void main (String[] args)
	{
		List<Employee> empList = new ArrayList<Employee>();
		
		try {
			
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/companydb", "postgres","password");
			
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM employee;");
			ResultSet rs = stmt.executeQuery();
			
			
			while(rs.next()) {	
				Employee employee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				empList.add(employee);
			
			}
			empList.forEach((n) -> System.out.println(n));
			
			
		}

		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}
}

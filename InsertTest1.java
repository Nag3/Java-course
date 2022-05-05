import java.sql.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.sbi.exception.ApplicantAlreadyExistsException;

public class InsertTest1 {

	public static void main(String[] args) {
		try
		{
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded.../registered....");
		
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected to the db....");
			
			PreparedStatement pst = conn.prepareStatement("INSERT INTO BANK_APPLICANT VALUES (?,?,?,?,?,?) ");
			System.out.println("Please Enter Applicant ID");
			Scanner sc=new Scanner(System.in);
			int aID=sc.nextInt();
			
			pst.setInt(1, aID);
			pst.setString(2, "ROBERT");
			pst.setString(3, "robert@gmail.com");
			pst.setString(4, "Mumbai");
			pst.setString(5, "6667778880");
			
			//Date d=new java.util.Date(1990,05,17);
			
			Calendar cal = Calendar.getInstance();
			java.util.Date date = cal.getTime();
			
			java.sql.Date sqlDate= new java.sql.Date(date.getTime());
			
			pst.setDate(6,sqlDate);
			
			
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM BANK_APPLICANT WHERE APPLICANT_ID="+aID);
			if(rs.next()) {
				throw new ApplicantAlreadyExistsException("Applicant already exists!!");
			}
			else {
				int row = pst.executeUpdate();
				System.out.println("prepared statement is created..."+pst);
				System.out.println("row inserted..."+row);
			}
			
			
			rs.close();
			st.close();
			pst.close();
			conn.close();
			System.out.println("DisConnected from the db....");
			
		}
		catch(SQLException | ApplicantAlreadyExistsException e) {
			e.printStackTrace();
		}
		
	}

}

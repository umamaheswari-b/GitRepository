//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;


public class JdbcDemo {

	public static void main(String[] args)  {
		//Connection conn=null;
		//Statement stmt=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.5.177:1521:NBCCBISSUE","scott","tiger");
			Statement stmt=conn.createStatement();
			// String qry="create table jdbcdemo(empno number,empname varchar2(20),add varchar(20))";
			 stmt.executeQuery("create table jdbcdemo(empno number,empname varchar2(20),add varchar(20))");
			 String qry1="insert into jdbcdemo values(1350,'Uma','Hyd')";
			 int update=stmt.executeUpdate(qry1);	
			 System.out.println("Row inserted :"+update);
		} 

		catch (SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
		
		

	}

}

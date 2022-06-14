import java.sql.*;
import java.util.*;
class ab{
public static void main(String args[])
{
Connection con=null;
try{
Class.forName("com.mysql.jdbc.Driver");

System.out.println("Success");
} catch(Exception e)
{
System.out.println(e);
}
try 
{
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/d1?autoconnect=true&useSSL=false","root","gehu");
	System.out.println("connection established succesfully ready to launch");
	
} catch(Exception e)
{
System.out.println("connection not established");
}
try
{
Statement st=con.createStatement();
//st.executeUpdate("insert into t1(id,name)values(15,'raj')");
ResultSet rs=st.executeQuery("Select * from t1");
while(rs.next())
{
System.out.print(rs.getInt(1));
System.out.println("  "+rs.getString(2));
}
}
catch(Exception e)
{
System.out.println("issue");
}
}}

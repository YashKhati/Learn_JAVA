import java.sql.*;
import java.util.*;
class jdbc{
	static class Node{
		int id;
		String name;
		public Node(int id , String name){
			this.id = id;
			this.name = name;
		}
	}
	public static void main(String[] args){
		ArrayList<Node> list = new ArrayList<>();
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("success");
		}catch(Exception e){
			System.out.println(e);
		}
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB?autoReconnect=true&useSSL=false" , "root" , "gehu");
			System.out.println("Connection Establ;ished");
		}catch(Exception e){
			System.out.println("Connetion Failed !");
		}
		try{
			Statement st = con.createStatement();
			// getData(list);
			// for(int i = 0 ; i < list.size() ; i++){
			// 	st.executeUpdate("insert into emp(id,name) values("+list.get(i).id+",'"+list.get(i).name+"')");	
			// }
			// System.out.println("Displaying data ");
			ResultSet rs = st.executeQuery("select * from emp");
			while(rs.next()){
				System.out.println("Name -> " + rs.getString(2)  + " ID -> " + rs.getInt(1));
			}
		}catch (Exception e){
			System.out.println("Error -> " + e);
		}
	}
	private static void getData(ArrayList<Node> list){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Entries");
		int n = sc.nextInt();
		while(n-- > 0){
			String line = sc.next();
			String[] temp = line.split("-");
			list.add(new Node(Integer.parseInt(temp[0]) , temp[1]));

		}
	}
}
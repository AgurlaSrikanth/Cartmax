import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;public class JDBCDemo {
private static Connection con;
private static String dburl="jdbc:oracle:thin:@localhost:1521:xe";
private static String USER="sri";
private static String password="tiger";
private static Statement stmt = null;
public static void createConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
con = DriverManager.getConnection(dburl,USER,password);
System.out.println("Connection Successfull");
}
private static void insertAuthors(int authorid,String authorname) throws SQLException
{
stmt = con.createStatement();
stmt.execute("insert into author values (" + authorid + ",'" + authorname +"')");
stmt.close();
System.out.println("Record Inserted");
}
private static void selectAuthors() throws SQLException
{
stmt = con.createStatement();
ResultSet results = stmt.executeQuery("select * from author");
ResultSetMetaData rsmd = results.getMetaData();
int numberCols = rsmd.getColumnCount();
for (int i=1; i<=numberCols; i++)
{
//print Column Names
System.out.print(rsmd.getColumnLabel(i)+"\t\t");
}
System.out.println("\n-------------------------------------------------");
while(results.next())
{ String authorid = results.getString(1);
String authorname = results.getString(2);
System.out.println (authorid + "\t\t" + authorname);
}
results.close();
stmt.close();
}
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
createConnection();
insertAuthors(102, "srikanth");
selectAuthors();
}}

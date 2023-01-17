import java.sql.*;
import java.util.Calendar;

/**
 * A Java MySQL PreparedStatement INSERT example.
 * Demonstrates the use of a SQL INSERT statement against a
 * MySQL database, called from a Java program, using a
 * Java PreparedStatement.
 *
 * Created by Alvin Alexander, http://alvinalexander.com
 */
public class JavaMysqlPreparedStatementInsertExample
{

    public static void main(String[] args)
    {
        try
        {
            // create a mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/test";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "example");

            // create a sql date object so we can use it in our INSERT statement

            // the mysql insert statement
            String query = " insert into users (id, first_name, last_name, address, is_admin, is_cool,num_points)"
                    + " values (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            // create the mysql insert preparedstatement
            preparedStmt.setInt    (1, 50);
            preparedStmt.setString (2, "Alfred");
            preparedStmt.setString (3, "Rubble");
            preparedStmt.setString  (4, "Flodo");
            preparedStmt.setBoolean(5, false);
            preparedStmt.setBoolean(6, true);
            preparedStmt.setInt    (7, 5000);

            // execute the preparedstatement
            preparedStmt.execute();

            preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, 51);
            preparedStmt.setString(2, "Dejan");
            preparedStmt.setString(3, "Steffan");
            preparedStmt.setString(4, "SEW");
            preparedStmt.setBoolean(5, false);
            preparedStmt.setBoolean(6, true);
            preparedStmt.setInt(7, 5000);


            // execute the preparedstatement
            preparedStmt.execute();

            String t = "SELECT * FROM users";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(t);

            while (rs.next()){
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String address = rs.getString("last_name");
                boolean isAdmin = rs.getBoolean("is_admin");
                boolean isCool = rs.getBoolean("is_admin");
                int numPoints = rs.getInt("num_points");

                // print the results
                System.out.println(id +" "+ firstName +" "+ lastName +" "+ address +" "+ isAdmin +" "+ isCool +" "+ numPoints);
            }
            st.close();
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
}
package show;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection 
{
    public static Connection connect()
    {
        Connection con = null;
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookShowDb", "root", "");
           return con;
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog( null, "Database Connection Failed","Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
        
    }
}

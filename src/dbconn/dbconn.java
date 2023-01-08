package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconn {
    public static Connection con;
    public static Connection createC()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/AuthSys";
            String user = "root";
            String password = "Passwd@mysql1*";
            
            con=DriverManager.getConnection(url, user, password);
        }
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        System.out.println(con);
        return con;
    }
}
package login;

import java.sql.Statement;
import java.sql.*; 
import dbconn.dbconn;
import java.sql.Connection;
import java.sql.SQLException;

public class login {
    static Connection con;
    public ResultSet login() {
        try{
            con =  dbconn.createC();
            String query = "select * from userDetails";
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(query);
            System.out.println("Details have fetched Successfully.");
            return set;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
}
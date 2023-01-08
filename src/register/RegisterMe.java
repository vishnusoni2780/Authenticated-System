package register;

import dbconn.dbconn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterMe {
    static Connection con;
    public void RegisterUser(RegisterMeModel regMe) {
        try{
            con =  dbconn.createC();

            String query = "insert into userDetails(UserName, EmailAddress, PhoneNumber, Password) VALUES(?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,regMe.getUserName());
            pstmt.setString(2,regMe.getEmailAddr());
            pstmt.setString(3,regMe.getPhnNum());
            pstmt.setString(4,regMe.getPasswd());

            pstmt.executeUpdate();
            System.out.println("User Registered Successfully.");
            con.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    
}

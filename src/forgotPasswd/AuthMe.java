package forgotPasswd;

import dbconn.dbconn;
import static dbconn.dbconn.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import login.login;

public class AuthMe {
    public boolean AuthMe(String EAorPN) {
        boolean flag=false;
        try{
            ResultSet set = new login().login();
            while(set.next()){
                String EmailAddr =set.getString("EmailAddress");
                String PhnNum =set.getString("PhoneNumber");
                if (EAorPN.equals(EmailAddr) || EAorPN.equals(PhnNum)){
                        flag = true;
                }
            }
            System.out.println("User Authenticated Successfully.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    
    public boolean updPasswd(String EAorPN, String UpdtdPasswd){
        boolean flag=false;
        try{
            con =  dbconn.createC();
            String query = "update userDetails SET Password=? WHERE EmailAddress=? OR PhoneNumber=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,UpdtdPasswd);
            pstmt.setString(2,EAorPN);
            pstmt.setString(3,EAorPN);
            pstmt.executeUpdate();
            System.out.println("User Updated Successfully.");
            flag=true;
            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    
}

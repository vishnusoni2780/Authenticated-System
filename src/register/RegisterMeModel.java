package register;

public class RegisterMeModel {
    private int uid;
    private String userName;
    private String emailAddr;
    private String phnNum;
    private String passwd;

    public int getSid() {
        return uid;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public String getPhnNum() {
        return phnNum;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setSid(int uid) {
        this.uid = uid;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public void setPhnNum(String phnNum) {
        this.phnNum = phnNum;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    
    public RegisterMeModel(String userName, String emailAddr, String phnNum, String passwd) {
        super();
        this.userName = userName;
        this.emailAddr = emailAddr;
        this.phnNum = phnNum;
        this.passwd = passwd;
    }
    public RegisterMeModel() {
        super();
    }

    @Override
    public String toString() {
        return "Register Me{" + "sid=" + uid + ", name=" + userName + ", email=" + emailAddr + ", phone=" + phnNum + ", city=" + passwd + '}';
    }
    
    
}


public class Credential
{
    private String id;
    private String password;

    /**
     * Constructor for objects of class Credential
     */
    public Credential(String newid, String newPassword)
    {
        this.id = newid;
        this.password = newPassword;
    }

   
    public void setId(String  id)
    {
        this.id = id;
    }
    
    public void setpassword(String  password)
    {
        this.password = password;
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getpassword(){
        return this.password;
    }
}

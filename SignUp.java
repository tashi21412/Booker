import java.util.*;
import java.lang.*;
import java.io.*;

public class SignUp
{
    
    
    
    
    
    public void createAccount(String newid, String newPassword,String firstName, String lastName){
        StatClasses.credential.put(newid,newPassword);
        Student student= new Student(firstName, lastName);
        StatClasses.account.put(newid, student);
        
    }
    
    
    
  
}

import java.util.*;
import java.lang.*;
import java.io.*;

public class YourAccount
{
    public Student student;
    
    public Student signIn(String id, String password){
        if (password.equals(StatClasses.credential.get(id))){
            student = StatClasses.account.get(id);
            return student;
        }
        else {
            return null;
        }
     
        
    }
    
    public void logOut(String id, Student hstudent){
        StatClasses.account.put(id,hstudent);
    
    }

    
   
   }


import java.util.*;
import java.lang.*;
import java.io.*;
/**
 * Write a description of class StatClasses here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StatClasses
{
    // instance variables - replace the example below with your own
    
    static Hashtable<String, Student> account = new Hashtable<String, Student>();
    static Hashtable<String, String> credential = new Hashtable<String, String>();
    Student student;
    
    public Student getStudent(String userid){
        
        this.student = account.get("userid");
        return student;
    }
    
    public void setStudent(String userid, Student student){
        account.put(userid, student);
    }
}



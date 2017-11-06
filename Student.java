import java.util.*;
import java.lang.*;
import java.io.*;


public class Student
{
    public String firstName;
    public String lastName;
    public ArrayList<Book> bookList;
   
    public Student(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookList = new ArrayList<Book>();
    }

   public String name(){
       return this.firstName + this.lastName;
    }
    
    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    
    }
    
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    
    public void addBook(String bookName, String bookAuthor, String department, String courseSOC)
    {   
        Book book =  new Book (bookName, bookAuthor,department, courseSOC);
        this.bookList.add (book);
    }
    
    public void removeBook(int indexNumber)
    {   this.bookList.remove(indexNumber-1);
    }
    
    public void printShelf (){
        for(int i = 0; i <this.bookList.size(); i++){
            System.out.println (i+1 +"  "+this.bookList.get(i).bookName+" "+this.bookList.get(i).bookAuthor+"  "+this.bookList.get(i).department+" "+this.bookList.get(i).courseSOC);
        }
        
    }
}

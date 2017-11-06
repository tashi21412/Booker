
/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    public String bookAuthor;
    public String bookName;
    public String department;
    public String courseSOC;
    
    public Book(String bookAuthor, String bookname,String department,String courseSOC)
    {
        this.bookAuthor = bookAuthor;
        this.bookName = bookname;
        this.department = department;
        this.courseSOC = courseSOC;
    }
    
    public void  setBookName(String newBookName){
        this.bookName = newBookName;
    }
    
    public void setbookAuthor(String newbookAuthor){
        this.bookAuthor = newbookAuthor;
    }
    
    public void setDepartment(String newDepartment){
        this.department = newDepartment;
    }
    
    public void setcourseSOC(String newCourseSOC){
        this.courseSOC = newCourseSOC;
    }

    
}

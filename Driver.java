import java.util.*;
import java.lang.*;
import java.io.*;

/** 
   */
public class Driver
{
    static Scanner sc = new Scanner(System.in);
    static YourAccount account = new YourAccount();
    static SignUp signup = new SignUp();
    static Student student;
    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println("WELCOME TO BOOKER! A book exchange App!");
        System.out.println("Please enter 1 to Sign In and 2 to sign up");
        
        int a = sc.nextInt();
      
        
        if(a == 1){
          signIn();
          
          
          }
          
        else if (a == 2)
          
        {
         signUp();
         
        }
        
        else 
        {
         System.out.println("You have entered the wrong option!"); 
          }
        
        sc.close();
    }
    
    public static void signUp(){
        System.out.println("First Name:");
         String firstName = sc.next();
         System.out.println("Last Name: ");
         String lastName = sc.next(); 
         System.out.println("Please Enter your pleased user name");
         String newUser = sc.next();
         System.out.println("Please set your password");
         String newPassword = sc.next();
         System.out.println("Please enter your password to confirm");
         String confirmationPassword= sc.next();
         
         while(!newPassword.equals(confirmationPassword)){
       
                System.out.println("please enter and reset your password again");
                newPassword = sc.next();
                System.out.println("Please enter your password to confirm");
                confirmationPassword = sc.next();
            }
         signup.createAccount(newUser, newPassword, firstName,lastName);
         System.out.println ("Congratulations! Your account has been created!");
         System.out.println("Your user name is: "+ newUser +" Your password, well keep it safe");
         signIn();
    }
    
    public static void signIn(){
            System.out.println("Enter User Name");
            String username = sc.next();
            System.out.println("Enter Password");
            String password = sc.next();
            student = account.signIn(username,password);
            if (student== null){
              
                System.out.println("Either your username or password is incorrect");
                System.out.println("Enter 1 to re-try or 2 to sign-up");
                int a = sc.nextInt();
                
                if (a == 1){
                    signIn();
                }
                else if (a==2) {
                    signUp();
                }
                else {
                    System.out.println("You have entered the wrong option!"); 
                
                }
            }
            else {
                System.out.println("Welcome " + student.firstName);
                System.out.println(" ");
                System.out.println("Here is your list of Books");
                student.printShelf();
                System.out.println("Enter 3 to addbook, 4 to remove book and 5 to logout");
    
            }
            
            
            boolean logout = false;
            while(!logout){
                int b = sc.nextInt();
                if (b ==3){
                    String authorname = sc.nextLine();
                    System.out.println("Author Name: ");
                    authorname = sc.nextLine();
                    System.out.println("Book Name: ");
                    String bookname = sc.nextLine();
                    System.out.println("Department");
                    String department = sc.nextLine();
                    System.out.println("SOC, if not type null:");
                    String soc = sc.nextLine();
                    
                    addBook(authorname, bookname,department, soc);
                }
                
                else if (b == 4){
                    System.out.println ("Please enter index number");
                    int c = sc.nextInt();
                    try {
                        removeBook(c);
                    }
                    catch (Exception e){
                        System.out.println("There is no book on that index");
                    }
                
                }
                
                else if (b == 5){
                    logout =true;
                }
                
                else {
                    System.out.println("Choice doesn't exist");
                }
            }
            
            System.out.println("Goodbye " + student.firstName);
            
        }
        
    public static void addBook(String authorname, String bookname, String department, String courseSOC){
        student.addBook(authorname, bookname, department, courseSOC);
        System.out.println();
        System.out.println("Here's your updated lists of Book");
        student.printShelf();
    }
    
    public static void removeBook(int index){
        student.removeBook(index);
        System.out.println();
        System.out.println("Here's your updated lists of Book");
        student.printShelf();
        
    }
    }

import java.util.*;

class AuthenticationException extends Exception
{
 public AuthenticationException(String message)
 {
  super(message);
 }
}

public class LoginAuth
{
 static final String VALID_USERNAME = "admin123";
 static final String VALID_PASSWORD = "password123";
 
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter Username: ");
  String username = sc.nextLine();
  
  System.out.println("Enter Password: ");
  String password = sc.nextLine();
  
  try
  {
   authenticate(username, password);
   System.out.println("Login Successfull");
  }
  catch(AuthenticationException e)
  {
   System.out.println("Authentication Failed: "+e.getMessage());
  }
 }
 
 static void authenticate(String username, String password) throws AuthenticationException
 {
  if(username.isEmpty() || password.isEmpty())
  {
   throw new AuthenticationException("Username or Password cannot be empty.");
  }
  if(username.length() < 5)
  {
   throw new AuthenticationException("Username must be atleast 5 characters long.");
  }
  if(password.length() < 8)
  {
   throw new AuthenticationException("Password must be atleast 8 characters long.");
  }
  if(!username.equals(VALID_USERNAME) || !password.equals(VALID_PASSWORD))
  {
   throw new AuthenticationException("Wrong Credentials.");
  }
 }
}

   
   
   
   
   

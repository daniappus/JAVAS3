import java.util.*;

class AuthenticationException extends Exception 
{
 public AuthenticationException(String message) 
 {
  super(message);
 }
}

class InvalidUsernameException extends AuthenticationException 
{
 public InvalidUsernameException() 
 {
  super("Invalid username! Username must be at least 5 characters long.");
  }
}

class InvalidPasswordException extends AuthenticationException 
{
 public InvalidPasswordException() 
 {
  super("Invalid password! Password must be at least 8 characters long and contain at least one digit.");
 }
}

class UsernameNotFoundException extends AuthenticationException 
{
 public UsernameNotFoundException() 
 {
  super("Username not found! Please register first.");
 }
}

class IncorrectPasswordException extends AuthenticationException 
{
 public IncorrectPasswordException() 
 {
  super("Incorrect password! Please try again.");
 }
}



class UserAuthenticator 
{
 private static final String VALID_USERNAME = "admin123";
 private static final String VALID_PASSWORD = "password123";
  
 public void validateUsername(String username) throws InvalidUsernameException 
 {
  if (username == null || username.length() < 5) 
  {
   throw new InvalidUsernameException();
  }

 }

 public void validatePassword(String password) throws InvalidPasswordException 
 {
  if (password == null || password.length() < 8 || !password.matches(".*\\d.*")) 
  {
   throw new InvalidPasswordException();
  }
 }

 public void authenticate(String username, String password) 
 throws AuthenticationException 
 {
  validateUsername(username);
  validatePassword(password);

  if (!username.equals(VALID_USERNAME)) 
  {
   throw new UsernameNotFoundException();
  }

  if (!password.equals(VALID_PASSWORD)) 
  {
   throw new IncorrectPasswordException();
  }

  System.out.println("Authentication successful! Welcome, " + username);
 }
}

public class AuthSys
{
 public static void main(String[] args) 
 {
  Scanner scanner = new Scanner(System.in);
  UserAuthenticator authenticator = new UserAuthenticator();
  System.out.println("===== User Authentication System =====");
  System.out.println("Note: Valid credentials for testing are:");
  System.out.println("Username: admin123");
  System.out.println("Password: password123");
  System.out.println("======================================");

  int attempts = 0;
  final int MAX_ATTEMPTS = 3;

  while (attempts < MAX_ATTEMPTS) 
  {
   try 
   {
    System.out.print("\nEnter username: ");
    String username = scanner.nextLine();
    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    authenticator.authenticate(username, password);

    break;

                

   } 
   catch (AuthenticationException e) 
   {
    System.out.println("Authentication Error: " + e.getMessage());
    attempts++;

    if (attempts < MAX_ATTEMPTS) 
    {
     System.out.println("Attempts remaining: " + (MAX_ATTEMPTS - attempts));
    }
    else 
    {
     System.out.println("Maximum login attempts exceeded. Please try again later.");
    }
   }
  }
 }
}

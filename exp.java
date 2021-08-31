import java.util.Scanner;
class UsernameException extends Exception {
    public UsernameException(String msg) {
        System.out.print(msg);
    }
}
class PasswordException extends Exception {
    public PasswordException(String msg) {
        System.out.print(msg);
    }
}
public class exp {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String username, password;
        System.out.print("Enter username: ");
        username = sc.nextLine();
        System.out.print("Enter password: ");
        password = sc.nextLine();
        int len = username.length();
        try {
            if(len < 8)
                throw new UsernameException(password);
            else if(!password.equals("admin"))
                throw new PasswordException("Incorrect password");
            else
                System.out.println("Login Successful");
        }
        catch (UsernameException u) {
            u.printStackTrace();
        }
        catch (PasswordException p) {
            p.printStackTrace();
        }
    }
}

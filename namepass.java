import java.util.Scanner;
public class namepass {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String name, password;
        System.out.print("Enter username: ");
        name = sc.nextLine();
        System.out.print("Enter password: ");
        password = sc.nextLine();
        int len = name.length();
        try {
            if(len < 8)
                throw new UsernameExp("Username must have minimum 8 characters\n");
            else if(!password.equals("admin"))
                throw new PasswordExp("Incorrect password");
            else
                System.out.println("Login Successful");
        }
        catch (UsernameExp u) {
            u.printStackTrace();
        }
        catch (PasswordExp p) {
            p.printStackTrace();
        }
    }
}

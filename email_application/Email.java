import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defalutPasswordLength = 10;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "fuyacompany.com";

    //constructor to recieve a firstname and lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("DEPARTMENT INPUT" + " " + this.department);

        this.password = raondomPassword(defalutPasswordLength);
        System.out.println("Your password is: " + this.password);

        String email = firstName.toLowerCase() + lastName.toLowerCase() + "." + "@" + this.department + "." + this.companySuffix;
        System.out.println("your email is: " + email);
    }

    //ask for the department
    private String setDepartment() {
        System.out.println("Enter the department\n1 for sales\n2 for development\n3 for accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";}
         else if (depChoice == 2) {
            return "dev";}
         else if (depChoice == 3) {
            return "acct";}
        else {return "";}
    }

    //generate a random password
    private String raondomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //set the mailbox capacity
    public void setMailBoxCapacity(int capacity) {
        mailboxCapacity = capacity;
    }

    //set the alternateEmail
    public void setAltEmail(String altEmail) {
        alternateEmail = altEmail;
    }

    //change the password
    public void changePassword(String password) {
        password = password;
    }

    public int getMailBoxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }
}
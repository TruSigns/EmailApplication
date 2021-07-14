package EmailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String fName;
    private String lName;
    private String password;
    private String department;
    private int defaultPassword = 10;
    private int mailBoxCapacity = 500;
    private String email;
    private String alternateEmail;
    private String companyName = "NightmareLLC.com";

    //constructor to receive user F and L name F= first L = Last
    public Email(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
        System.out.println("New user " + this.fName +" " + this.lName + " created an new Email account");


        //Call a method for the department-return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //call method that'll return password
        this.password = randomPassword(defaultPassword);
        System.out.println("Your password is : " + this.password);

        //combine element to generate email
        email = fName.toLowerCase() + "." + lName.toLowerCase() + "@" + department + "." + companyName;
        System.out.println("Your official Email name is: " + email + "  ....lame");



    }

    //Creating a method that'll return a random password ._.
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXY123456780!@#$%^&";
        char[] password = new char[length];
        for(int i = 0; i < length ; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }





    // Ask for the department
    private  String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for sales\n2 for development\n3 for account\n4 for none\nEnter Department Code: ");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if(depChoice  == 1){
            return "Sales";
        }else if(depChoice == 2){
            return "Development";
        }else if(depChoice == 3){
            return  "Account";
        }else if(depChoice > 0 || depChoice < 4){
            return "Invalid Entry";
        }

        return "";

    }

    // set the mailbox capactiy

    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }


    //set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // change the password

    public void changPassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return  password;
    }

    public String showInfo(){
        return "Display Name: " + fName + "" + lName +
                "Company Email: " + email +
                "Mailbox capacity: " + mailBoxCapacity + "mb";
    }

}

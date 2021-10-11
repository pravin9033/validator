package PasswordValidation;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[]args){
        mypassword pass = new mypassword();
        pass.getInfo();
    }
}
class mypassword {
    private static String username;
    private static String email;
    private static String password;
    private static char c;

    private static boolean hasnum = false;
    private static boolean hasupper = false;
    private static boolean haslower = false;
    private static boolean haslength = false;

    public static void getInfo(){
        Scanner x = new Scanner(System.in);

        System.out.println("Enter Your Username");
        username = x.nextLine();

        System.out.println("Enter Your Email");
        email = x.nextLine();

        System.out.println("Enter Your Password");
        password = x.nextLine();

        System.out.println(myrule(password));

    }
    public static String myrule( String password){
        for(int i = 0; i<password.length();i++){
            c = password.charAt(i);

            if(password.length()>8){
                haslength = true;
            }
            if(Character.isUpperCase(c)){
                hasupper = true;
            }
            if(Character.isLowerCase(c)){
                haslower = true;
            }
            if(Character.isDigit(c)) {
                hasnum = true;
            }
        }
        if(hasnum && haslower && hasupper && haslength){
            return "You have a strong Password";
        }
        return "Your password must contain atleast 8 characters \nYour password must contain atleast 1 uppercase \nYour password must contain atleast 1 lowercase \nYour password must contain atleast one digit";
    }

}

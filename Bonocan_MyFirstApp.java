import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullName = reader.nextLine();

        System.out.println("Hello, " + getFirstName(fullName) + " " + getMiddleName(fullName) + " " + getLastName(fullName) + ".");

        Date currentDate = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        formatDate.setTimeZone(TimeZone.getTimeZone("PST"));
        System.out.println("It is currently " + formatDate.format(currentDate) + ". If you have anything you need to do, do them now.");
        
        System.out.println("Don't wait until tomorrow. Good luck :)");
    }

    public static String getFirstName(String fullName) {
        return fullName.substring(0, fullName.indexOf(' '));
    }

    public static String getMiddleName(String fullName) {
        int firstSpace = fullName.indexOf(' ');
        int lastSpace = fullName.lastIndexOf(' ');
        if (firstSpace == lastSpace) {
            return "";
        }
        return fullName.substring(firstSpace + 1, lastSpace);
    }

    public static String getLastName(String fullName) {
        return fullName.substring(fullName.lastIndexOf(' ') + 1);
    }
}

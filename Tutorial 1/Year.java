import java.util.Scanner;

public class Year {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        String year = scanner.nextLine();

        System.out.print("What is your date of birth? (DD/MM/YYYY): ");
        String dob = scanner.nextLine();

        System.out.println("Current Year is " + year + " and your D.O.B is " + dob );
    }

}

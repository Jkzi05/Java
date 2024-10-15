import java.util.Scanner;

public class TA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name_of_the_student = sc.nextLine();
        System.out.print("Please enter your TA's name: ");
        String name_of_the_TA = sc.nextLine();
        System.out.println("Dear " + name_of_the_TA + ",");
        System.out.println("I enjoy your tutorials, they are awesome!");
        System.out.println(name_of_the_student);
    }
}
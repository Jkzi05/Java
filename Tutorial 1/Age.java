import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What year is it: ");
        int year = sc.nextInt();
        System.out.print("What year were you born in: ");
        int born = sc.nextInt();
        int age = year - born;
        System.out.println("You are "+ age + " years old.");
    }
}

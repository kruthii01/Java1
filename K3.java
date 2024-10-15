package pkg1;
import java.util.Scanner;
public class K3 {
    public static void main(String[] args) {

        int usn;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting usn:");
        int number = scanner.nextInt();
        System.out.println("Enter the ending usn:");
        int number1 = scanner.nextInt();
        System.out.println("USN are:");
        String usn2="";
        for (int i = number; i <= number1; i++) {
        	usn2=String.format("%03d",i);
            System.out.println("4MW23CS"+usn2);
        }
    }
}
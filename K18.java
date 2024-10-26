package pkg1;
public class K18 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 6;

        // Calculations
        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        double div1 = (double) num1 / num2;
        int div2 = num1 / num2;
        int rem1 = num1 % num2;
        double exp1 = Math.pow(num1, num2);

        System.out.println("Sum: " + sum+"\nDifference: " + diff+"\nProduct: " + prod+"\nDecimal Division: " + div1+"\nQuotient: " + div2+"\nRemainder: " + rem1+"\nExponentiation: " + exp1);
        
    }
}
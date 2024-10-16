package pkg1;

import java.util.Scanner;

public class K4 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
            float tempC;
                float tempF;
                System.out.println("Enter the temperature in celcius:");
                tempC = scanner.nextFloat();
                tempF=((tempC*9)/5)+32;
                System.out.println("Temperature in Fahrenheit:"+tempF);
        }

}
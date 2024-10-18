
package pkg1;
public class K13 {
    public static void main(String[] args) {
        System.out.println("Data Type\tDefault Value\tMin Value\t\tMax Value");
        
        System.out.println("byte\t\t" + (byte)0 + "\t\t" + Byte.MIN_VALUE + "\t\t\t" + Byte.MAX_VALUE);
        System.out.println("short\t\t" + (short)0 + "\t\t" + Short.MIN_VALUE + "\t\t\t" + Short.MAX_VALUE);
        System.out.println("int\t\t" + (int)0 + "\t\t" + Integer.MIN_VALUE + "\t\t" + Integer.MAX_VALUE);
        System.out.println("long\t\t" + (long)0 + "\t\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
        System.out.println("float\t\t" + (float)0.0 + "\t\t" + Float.MIN_VALUE + "\t\t\t" + Float.MAX_VALUE);
        System.out.println("double\t\t" + (double)0.0 + "\t\t" + Double.MIN_VALUE + "\t\t" + Double.MAX_VALUE);
    }
}
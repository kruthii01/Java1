package pkg1;
class ExampleClass {
    public static int count = 0;
    public int id;

    public ExampleClass() {
        count++;
        id = count;
    }

    public static void printCount() {
        System.out.println("Number of instances: " + count);
    }

    public void printId() {
        System.out.println("Instance ID: " + id);
    }
}
public class K36 {
    public static void main(String[] args) {
        ExampleClass e1 = new ExampleClass();
        ExampleClass e2 = new ExampleClass();
        ExampleClass e3 = new ExampleClass();

        e1.printId();
        e2.printId();
        e3.printId();

        ExampleClass.printCount();
    }
}
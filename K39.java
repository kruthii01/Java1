
package pkg1;
class OuterClass {
    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";
    class InnerClass {
        void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }
}
public class K39{
	public static void main(String[] args) {
        System.out.println("Inner class:");
        OuterClass o1 =new OuterClass();
        OuterClass.InnerClass i1 = o1.new InnerClass();
        i1.accessMembers();
    }
}

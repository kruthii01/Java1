package pkg1;
class A {
	   void funcA() {
	      System.out.println("This is class A");
	   }
	}
	class B extends A {
	   void funcB() {
	      System.out.println("This is class B");
	   }
	}
	class C extends B {
	   void funcC() {
	      System.out.println("This is class C");
	   }
	}
	public class K38 {
	   public static void main(String args[]) {
	      C obj = new C();
	      obj.funcA();
	      obj.funcB();
	      obj.funcC();
	   }
	}
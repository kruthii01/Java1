package pkg1;

class DivByZeroException extends Exception{
        public DivByZeroException(String message) {
                super(message);
        }
}
public class K41{

        public static void main(String[] args) {
                System.out.println("Exception");
                int nr=10;
                int dr=0;
                int result;
                try {    
                	if(dr==0) {
                                throw new DivByZeroException("division by zero not allowed");
                        }
                }

                catch(DivByZeroException e1) 
                
                {
                		//System.out.println("error in first catch block");
                        System.out.println("error:"+e1.getMessage());
                }
                catch(ArithmeticException e2)
                {
                	    //System.out.println("error in second catch block");
                        System.out.println(e2.getMessage());
                }
                finally
                {
                        System.out.println("Finally block executed");
                }

        }

}
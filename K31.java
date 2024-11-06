
package pkg1;
import pkg2.Tools3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class K31 {

        public static void main(String[] args) throws FileNotFoundException {
                File f1=new File("names.txt");
                Scanner sc1=new Scanner(f1);
                String name="";
                Tools3 t1=new Tools3();
                while(sc1.hasNext()){
                        name=sc1.nextLine();
                        System.out.println(t1.reverse(name));


                }
                sc1.close();




        }

}
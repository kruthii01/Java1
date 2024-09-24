class Human{
    public void job(){
        System.out.println("Working Professional");}}
class Teacher extends Human{
    public void job(){
        System.out.println("Teacher");}}
class Doctor extends Human{
    public void job(){
        System.out.println("Docter");}}
public class K7{
    public static void main(String[] args){
        Human anu=new Human();
        Teacher bhanu=new Teacher();
        Doctor chandru=new Doctor();
        Human suresh =new Doctor();
        anu.job();
        bhanu.job();
        chandru.job();
        suresh.job();
        
        
    }
}

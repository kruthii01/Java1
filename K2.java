class Employee{
    private int id;
    private String name;
    private double salary;
    public Employee(int id,String name,double salary){
this.id=id;
this.name=name;
this.salary=salary;}
    public void raiseSalary(double percent){
        if(percent>0){
            double increament=salary*percent/100;
            salary=salary+increament;
            System.out.println("new Salary: "+salary);}
        else{
            System.out.println("Salary: "+salary);}}
    public void getEmpDetails(){
        System.out.println(name + " " + id + " "+ salary);}}
public class K2{
    public static void main(String[] args){
        Employee emp1=new Employee(1,"Kruthi",5000);
        emp1.getEmpDetails();
        
        emp1.raiseSalary(10);
        emp1.getEmpDetails();
        
        } 
    }



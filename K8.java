class TimeTable{
    int year;
    String[]day={"Mon","Tue","wed","Thur","Fri","sat"};
    int[]periods={1,2,3,4,5,6,7};
    String[] batch={"4MW23CS","4MW22CS","4MW21CS","4MW220CS"};
    String[]subject={"OOPJ"};
    String[]faculty={"Kuthyar Sir","C Kthyar sir","Chitra madam"};
    String[]sections={"A","B","C"};
    boolean isLab;
    String section;
    TimeTable(int y1,String S1){
        this.year=y1;
        this.section=S1;}
    public void printTimeTable(){
        String heading=year+"-"+batch[year-1];
        System.out.println("Time Table of Year "+heading+" Section" +section);}}
public class K8{
    public static void main(String[]args){
        TimeTable tt2A=new TimeTable(2,"A");
        TimeTable tt2B=new TimeTable(2,"B");
        tt2A.printTimeTable();
        tt2B.printTimeTable();}}
        
        
     
import java.util.Scanner;
public class EmployeeTester  {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        
        int daysLate=sc.nextInt();
        Employee e1=new Employee(name,daysLate);
       e1.calculateNetSalary();
       e1.getDetail();
       sc.close();

    }

}
class  Employee{
    private String name;
    
    private double basicSalary;
    private double total;
    private double Salary;
    private double HRA=0.20;
     private double DA=0.10;
     private double PF=0.08;


    public  Employee(String name,double basicSalary){
        this.name=name;
        
        this.basicSalary=basicSalary;

    }
   
    public  double calculateNetSalary(){
        if(basicSalary<0){
            System.out.println("Salary cannot be Negative.");
            System.exit(0);
        }
        Salary=(((basicSalary*HRA)+(basicSalary*DA))-(basicSalary*PF));
        total=basicSalary+Salary;
        return total;
        
    } 
    public  void getDetail(){
        System.out.println("Net Salary of "+name+": "+ calculateNetSalary() );
         


    }
    
}
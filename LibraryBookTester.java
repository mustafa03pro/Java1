import java.util.Scanner;
public class LibraryBookTester {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        
        int daysLate=sc.nextInt();
        LibraryBook b1=new LibraryBook(name,daysLate);
       b1.calculateFine();
       b1.getDetail();

    }

}
class LibraryBook{
    private String name;
    
    private int daysLate;
    private int total;


    public LibraryBook(String name,int daysLate){
        this.name=name;
        
        this.daysLate=daysLate;

    }
   
    public  int calculateFine(){
        if(daysLate<0){
            System.out.println("Days Late cannot be Negative.");
            System.exit(0);
        }
        total=daysLate*5;
        return total;
        
    } 
    public  void getDetail(){
        System.out.println("Book: "+ name + ", Fine: "+ calculateFine());
         //System.out.println("total:"+calculateBill());


    }
    
}
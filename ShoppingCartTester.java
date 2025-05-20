import java.util.Scanner;
public class ShoppingCartTester{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextline();
        double price=sc.nextdouble();
        int qty=sc.nextInt();
       ShoppingCart c1=new ShoppingCart(name,price,qty);
       c1.calculateBill();
       c1.getDetail();
       // System.out.println(c1);

    }

}
class ShoppingCart{
    private String name;
    private double price;
    private int qty;
    private double total;


    public ShoppingCart(String name,double price,int qty){
        this.name=name;
        this.price=price;
        this.qty=qty;

    }
   
    public  double calculateBill(){
        total=price*qty;
        return total;
        
    } 
    public  void getDetail(){
        System.out.println("item:"+name);
         System.out.println("total:"+calculateBill());


    }
    
}
import java.util.Scanner;
public class BasicMain {
    public static void printHelloAnkit(){
        System.out.println("HEllo World");
        System.out.println("Welcome to Apna College");
        System.out.println("Welcome to the DSA Class");
    }
    public static void calsum(){
         Scanner sc=new Scanner(System.in);
         System.out.println("EnterFirst Number:");
         //System.out.println("Enter Seconf Number:");
        int a=sc.nextInt();
        System.out.println("Seconf Number:");
        int b=sc.nextInt();
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;

        System.out.println("Sum of:"+c);
        System.out.println("Sum of:"+d);
        System.out.println("Sum of:"+e);
        System.out.println("Sum of:"+f);
    
    
    
    }
    public static void main(String[]args){
       
        //printHelloAnkit();
        calsum();

    }
    
}

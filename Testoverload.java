import java.util.Scanner;

public class Testoverload {
    public void add(int a){
     int b=20;
     System.out.println(a+b);

    }
    public void add (int a, int b){
        System.out.println(a+b);

    }
} 
  class Testpolymor {
 public static void main(String[] args){
    System.out.println("called first");
    Testoverload overload=new Testoverload();
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter values");    

    overload.add(scanner.nextInt());
    
    System.out.println("Enter two values");
    overload.add(scanner.nextInt(),scanner.nextInt());
 }

    
 }       
    
    


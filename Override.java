class Parent {
    int a=10; //class or global
    public void name(){
        System.out.println(" I have a usernamme");

    }
 }  
  class child extends Parent
  { int b=20;
    public void accountNumber()
    {
        System.out.println("I have an account number");
    }
  
      
public void name(){
    System.out.println(a+b);
     System.out.println("I have a username with account number");
    }
  
}    
      
      
      public class Override{

        public static void main(String[] args){
        child account=new child();
        account.b=25; // instance
        account.name();
        account.a=20;
        account.name();
        
    
    
    }

}

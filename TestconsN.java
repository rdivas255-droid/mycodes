public class TestconsN {
    public TestconsN(){
        System.out.println("hi from java ");

    }
  public TestconsN(int a){
    System.out.println("hi from java with parameter: " + a);
  }
public void call (){
    System.out.println("hi from java method");

    
}
}
class callprevious extends TestconsN{
    
    public void call ()
    {
        System.out.println("hi from call 2nd method");
    }
}


 class Testcons{
    public static void main(String[] args) {
        TestconsN obj = new TestconsN();
        TestconsN obj1 = new TestconsN(5);
        obj.call();
        callprevious obj2 = new callprevious();
        obj2.call();
    }
}

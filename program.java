interface Myinterface
{
    public void method1();
    public void method2();
}
class program implements Myinterface
{
    public void method1()
    {
        System.out.println("impplements of method1");
    }
    public void method2()
    {
         System.out.println("impplements of method2");
    }
    public static void main(String[] args) {
        Myinterface a=new program();
        a.method1();
        a.method2();
    }
    }
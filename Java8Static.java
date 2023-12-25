//interface_name.static_methodName
interface Static_method{
    void show();//declare
    static void msg(){//defination
        System.out.println("Static interface method ");
    }
}
class Cs1 implements Static_method{
    public void show(){
        System.out.println("class method");
    }
}
public class jstak{
    public static void main(String[] args) {
        Cs1 sm =new Cs1();
        sm.show();
        //Static_method.msg();//static method call
    }
}

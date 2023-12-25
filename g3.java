//Q.wap in java to find the greatest between three no?

class g3
{
public static void main(String x[])
{
int x1=Integer.parseInt(x[0]);
int x2=Integer.parseInt(x[1]);
int x3=Integer.parseInt(x[2]);
if(x1>x2 && x1>x3)
System.out.println("x1 is greatest=" +x1);
else{
if(x2>x1 && x2>x3){
System.out.println("x2 is greatest=" +x2);
}
else{
System.out.println("x3 is greatest=" +x3);
}
}
}
}

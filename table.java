//Q.wap in java to find the table of a given no? 

class table
{
public static void main(String x[])
{
int n=Integer.parseInt(x[0]);

int i;
System.out.println("Table of " +n);
for(i=1;i<=10;i++){
System.out.println(+(n*i));
}
}
}
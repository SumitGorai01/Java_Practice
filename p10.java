/*
wap in java to print the pattern
1 2 3 4 5
2 2 3 4 5
3 3 3 4 5
4 4 4 4 5
5 5 5 5 5
*/
class p10
{
public static void main(String ak[])
{
int i,j;
for(i=1;i<=5;i++)
{
for(j=1;j<=5;j++)
{
if(j<=i)
System.out.print(i+" ");
else
System.out.print(j+" ");
}
System.out.println();
}
}
}
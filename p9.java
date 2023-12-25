/*
wap in java to print the pattern
1 1 1 1 1
1 2 2 2 2
1 2 3 3 3
1 2 3 4 4
1 2 3 4 5
*/
class p9
{
public static void main(String ak[])
{
int i,j;
for(i=1;i<=5;i++)
{
for(j=1;j<=5;j++)
{
if(i<=j)
System.out.print(i+" ");
else
System.out.print(j+" ");
}
System.out.println();
}
}
}
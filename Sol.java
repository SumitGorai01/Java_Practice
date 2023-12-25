import java.util.*;
import java.lang.*;
import java.io.*;
public class Sol
{
public static int smallestStockPrice(int[] stock,int valueK)
{
int idx,idx1;
int answer=0,t;
for(idx=0;idx<stock.length;idx++)
{
for(idx1=idx+1;idx1<stock.length;idx1++)
{
if(stock[idx]>stock[idx1])
{
t=stock[idx];
stock[idx]=stock[idx1];
stock[idx1]=t;
}
}
}

answer=stock[valueK-1];
return answer;
}
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
//input for stock
int stock_size=in.nextInt();
int stock[]=new int[stock_size];
for(int idx=0;idx<stock_size;idx++)
{
stock[idx]=in.nextInt();
}
//input for valueK
int valueK=in.nextInt();
int result=smallestStockPrice(stock,valueK);
System.out.println(result);
}
}
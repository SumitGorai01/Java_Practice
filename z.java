/* 
//wap in java to add to no. using command line argument
class a 
{
public static void main(String x[])
{
int a=Integer.parseInt(x[0]);
int b=Integer.parseInt(x[1]);
int c=a+b;
System.out.println("sum="+c);
}
}

//wap in java to check a no. is odd or even using command line argument
class a 
{
public static void main(String x[])
{
int num=Integer.parseInt(x[0]);
if(num%2==0)
System.out.println("even no.");
else
System.out.println("odd no.");
}
}

//wap in java to find the greater b/w two no. using command line argument
class a
{
public static void main(String x[])
{
int a=Integer.parseInt(x[0]); 
int b=Integer.parseInt(x[1]);
if(a>b)
System.out.println("A is Greater");
else 
System.out.println("B is greater");
}
}

//wap in java to find the greater b/w two no. using conditional operator
class a 
{
public static void main(String x[])
{
int a=Integer.parseInt(x[0]);
int b=Integer.parseInt(x[1]);
int max=a>b?a:b;
System.out.println("greater no.="+max);
}
}

//wap in java to find the table of a given no.
class a 
{
public static void main(String x[])
{
int n=Integer.parseInt(x[0]);
System.out.println("Table of "+n );
for(int i=1;i<=10;i++)
System.out.println(n+"x"+i+"="+i*n);
}
}

//wap in java to find the factorial of a given no.
class a 
{
public static void main(String x[])
{
int f=1;
int n=Integer.parseInt(x[0]);
for(int i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("fact ="+f);
}
}

//wap in java to check a no. is prime or not
class z 
{
public static void main(String x[])
{
int n,f=0,i;
n=Integer.parseInt(x[0]);
for(i=1;i<=n;i++)
{
if(n%i==0)
f++;
}
if(f==2)
System.out.println("Prime no.");
else
System.out.println("Not a prime no."); 
}
}

// wap in java to check a no. is pailindrome or not
class z 
{
public static void main(String x[])
{
int n,r,sum=0,temp;
System.out.println("Enter no. to check palindrome or not:");
n=Integer.parseInt(x[0]);
temp=n;
while(n>0)
{
r=n%10;
sum=sum*10+r;
n=n/10;
}
if(temp==sum)
System.out.println("palindrome no.");
else
System.out.println("Not a palindrome no.");
}
}

//wap in java to find the greatest no. b/w three no. using conditional 
operator(using Scanner class).
import java.util.*;
class z 
{
public static void main(String ak[])
{
Scanner sc= new Scanner(System.in);
int a,b,c,max=0;
System.out.println("Enter three no.:");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
max=a>b&&b>c?a:a>c?b:c;
System.out.println("Greatest no.="+max);
}
}


//wap in java to add to no. using BufferReader.
import java.io.*;
class z
{
public static void main(String ak[])throws IOException
{
int a,b,c;
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter two nos :");
a=Integer.parseInt(obj.readLine());
b=Integer.parseInt(obj.readLine());
c=a+b;
System.out.println("Sum="+c);
}
}


//wap in java to check a no. is prime or not using BufferedReader.
import java.io.*;
class z
{
public static void main(String ak[])throws IOException
{
int n,i,f=0;
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no. to check prime or not: ");
n=Integer.parseInt(obj.readLine());
for(i=1;i<=n;i++)
{
if(n%i==0)
f++;
}
if(f==2)
System.out.println("Prime no.");
else
System.out.println("Not a prime no.");
}
}


//wap in java to check a three digit no. is armstrong or not.
import java.io.*;
class z
{
public static void main(String ak[])throws IOException
{
int n,i,sum=0;
BufferedReader obj =new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter three digit no. to check armstrong or not: ");
n=Integer.parseInt(obj.readLine());
for(i=n;i>0;i=i/10)
{
sum=sum+(i%10)*(i%10)*(i%10);
}
if(sum==n)
System.out.println("Armstrong no.");
else
System.out.println("Not Armstrong no.");
}
}


//wap in java to create and display 'n' size of dynamic 1-D array
import java.util.*;
class z
{
public static void main(String ak[])
{
Scanner sc=new Scanner(System.in);
int n,i;
System.out.println("Enter no. of element in array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter Array elements :");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Array elements are :");
for(i=0;i<a.length;i++)
System.out.print(a[i]+ 	"\t");
}
}

//wap in java to create 1-d array of size 'n' and perform the following task:
1. sort the array 
2. search the array
3. find the max and 2nd max array element
4. find the sum and average of array element
5. find the sum of only even element in an array
6. display the prime inside an array

//1. sort the array

import java.util.*;
class z
{
public static void main(String ak[])
{
int i,j,t;
int a[]={21,25,12,42,10};
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("Array elements after sorting:");
for(i=0;i<a.length;i++)
{
System.out.print(a[i]+"\t");
}
}
}

//2. search an element

import java.util.*;
class z 
{
public static void main(String ak[])
{
int i,key,f=0;
Scanner sc =new Scanner(System.in);
int a[]={14,25,45,78,12};
System.out.println("Enter data for search:");
key=sc.nextInt();
for(i=0;i<a.length;i++)
{
if(a[i]==key)
{
System.out.println("Data Found");
f++;
break;
}
}
if(f==0)
System.out.println("Data not found");
}
}

//3.find the max and 2nd max array element

import java.util.*;
class z
{
public static void main(String ak[])
{
Scanner sc=new Scanner(System.in);
int n,i;
System.out.println("Enter elements in which u want to find max and 2nd max:");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<a.length;i++)
{
System.out.println("Data enter by user to find max1 and  max2 :"+a[i]);
}
int max1=0,max2=0;
for(i=0;i<a.length;i++)
{
if(a[i]>max1)
max1=a[i];
}
System.out.println("1st max no.="+max1);
for(i=0;i<a.length;i++)
{
if(a[i]==max1)
continue;
else
{
if(a[i]>max2)
max2=a[i];
}
}
System.out.println("2nd max no.="+max2);
}
}


//4. find the sum and average of array elements

import java.util.*;
class z
{
public static void main(String ak[])
{
int n,i;
double sum=0,avg=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no.in array:");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
System.out.println("Arraysum="+sum);
avg=avg+(sum/a.length);
System.out.println("Average of array elements:"+avg);
}
}


//find the sum of only even element in array

import java.util.*;
class z
{
public static void main(String ak[])
{
Scanner sc=new Scanner(System.in);
int n,i,evensum=0,oddsum=0;
System.out.println("Enter size of array: ");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter array elements :");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<a.length;i++)
{
if(a[i]%2==0)
evensum=evensum+a[i];
continue;
}
else
{
oddsum=oddsum+a[i];
}
System.out.println("Sum of odd element of array:"+oddsum);
System.out.println("Sum of even element of array:"+evensum);
}
}


//wap in java to display the prime inside an array 

import java.util.*;
class z
{
public static void main(String ak[])
{
int i,j,f=0,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Array elements are:");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Prime no. in array are:");
for(j=0;j<a.length;j++)
{
f=0;
for(i=1;i<=a[j];i++)
{
if(a[j]%i==0)
f++;
}
if(f==2)
System.out.println(a[j]);
}
}
}
*/

//wap in java to display m*n (2-d) matrix 

import java.util.*;
class matrix
{
public static void main(String ak[])
{
int r,c,i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter rows and cols:");
r=s.nextInt();
c=s.nextInt();
int a[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("Matrixs is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println("\n");
}
}
}

//wap in java to add two matrix 

import java.util.*;
class addmatrix
{
public static void main(String ak[])
{
int r,c,i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter rows and cols:");
r=s.nextInt();
c=s.nextInt();
int a[][]=new int[r][c];
int b[][]=new int[r][c];

System.out.println("Enter Elements of first matrix:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}

System.out.println("firstr Matrixs is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println("\n");
}

System.out.println("Enter Elements of second matrix:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
b[i][j]=s.nextInt();
}
}

System.out.println("Second Matrixs is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println("\n");
}
System.out.println("Sum  of matrix is :");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[j][i]+b[i][j]+"\t")
}
System.out.println("\n");
}
}
}


//wap in java to find transpose of matrix

import java.util.*;
class transpose
{
public static void main(String ak[])
{
int r,c,i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter rows and cols:");
r=s.nextInt();
c=s.nextInt();
int a[][]=new int[r][c];
int b[][]=new int[r][c];

System.out.println("Enter Elements of first matrix:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}

System.out.println(" Matrixs is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println("\n");
}
System.out.println("Transpose of matrix is :");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[j][i]+"\t");
}
System.out.println("\n");
}
}
}


//wap in java to chech whether a matrix is unit or not?

import java.util.*;
class unit 
{
public static void main(String ak[])
{
int r,c,i,j,k=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter rows and cols:");
r=s.nextInt();
c=s.nextInt();
int a[][]=new int[r][c];
System.out.println("Enter Elements of first matrix:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}

System.out.println(" Matrixs is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println("\n");
}

for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(a[i][j]!=1 && a[j][i]!=0)
{
k++;
break;
}
}
}
if(k==0)
System.out.println("Unit matrix");
else
System.out.println("Not a Unit Matrix");
}
}


//wap in java to display left diogonal of matrix

import java.util.*;
class leftdio
{
public static void main(String ak[])
{
int r,c,i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter rows and cols:");
r=s.nextInt();
c=s.nextInt();
int a[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("Matrixs is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println("\n");
}
System.out.println("Left diagonal Elements are:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(i==j)
System.out.print(a[i][j]+"\t");
else
System.out.print("\t");
}
System.out.println("\n");
}
}
}


//wap in java to display right diogonal of matrix

import java.util.*;
class rightdio
{
public static void main(String ak[])
{
int r,c,i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter rows and cols:");
r=s.nextInt();
c=s.nextInt();
int a[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("Matrixs is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println("\n");
}
System.out.println("Left diagonal Elements are:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(i+j==2 && i==j)
System.out.print(a[i][j]+"\t");
else
System.out.print("\t");
}
System.out.println("\n");
}
}
}


//wap in java to display right and left diogonal of matrix

import java.util.*;
class leftright
{
public static void main(String ak[])
{
int r,c,i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter rows and cols:");
r=s.nextInt();
c=s.nextInt();
int a[][]=new int[r][c];
System.out.println("Enter Matrix Elements:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("Matrixs is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println("\n");
}
System.out.println("Left and Rigth diagonal Elements are:");
int x=r-1;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(i+j==x || i==j)
System.out.print(a[i][j]+"\t");
else
System.out.print("\t");
}
System.out.println("\n");
}
}
}


//wap in java to justify the statement "vector is any type any size dynamic generic array"

import java.util.*;
class vec
{
public static void main(String ak[])
{
int i;
Vector v=new Vector();
System.out.println(v.size());
v.add(12);
System.out.println(v.size());
v.add(12.34);
System.out.println(v.size());
v.add('$');
System.out.println(v.size());
v.add("vector");
System.out.println(v.size());
v.add("vector in java");
System.out.println(v);

//fetch  elements one by one from vector
for(i=0;i<v.size();i++)
{
System.out.print(v.elementAt(i)+"\t");
}
}
}


//enumeration in java

import java.util.*;
class enm
{
public static void main(String ak[])
{
Vector v=new Vector();
v.add(12);
v.add(12.34);
v.add('$');
v.add("vector");
Enumeration e=v.elements();
while(e.hasMoreElements())
{
System.out.println(e.nextElement());
}
}
}


//iteration in java

import java.util.*;
class ite
{
public static void main(String ak[])
{
Vector v=new Vector();
v.add(12);
v.add(12.34);
v.add('$');
v.add("vector"); 
Iterator i=v.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}


//wap in java to justify the statement "ArrayList is any type any size dynamic generic array"

import java.util.*;
class arlist
{
public static void main(String ak[])
{
int i;
ArrayList a=new ArrayList();
System.out.println(a.size());
a.add(12);
System.out.println(a.size());
a.add(12.34);
System.out.println(a.size());
a.add('$');
System.out.println(a.size());
a.add("vector");
System.out.println(a.size());
a.add("vector in java");
System.out.println(a);
}
}


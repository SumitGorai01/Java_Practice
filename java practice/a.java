import java.util.*;
class a{
public static void main(String ar[]){
Scanner sc=new Scanner(System.in);
System.out.println("no of rows and column:");
int r=sc.nextInt();
int c=sc.nextInt();
int a[][]=new int[r][c];
System.out.println("Enter total no of element:");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
a[i][j]=sc.nextInt();
}
}
/*System.out.println("matrix is:");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(a[i][j]+"\t");
}
System.out.println();
}*/
int f=0,c1=0;
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
if(r==c)
{
if(i==j && a[j][i]==1){
f++;}
if(i!=j && a[i][j]==0){
c1++;}
}
else{
System.out.println("Given matrix is not Sq.matrix that's why it doesnot be unit matrix:");
}
}
}
if(f==r &&c1<=((r*c)-r)){
System.out.println("Given matrix is unit matrix");
}
 else{
System.out.println ("not a unit matrix:");
}   

}
}
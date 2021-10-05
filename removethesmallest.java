import java.util.*;
public class main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
boolean bool=false;
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
for(int i=0;i<n-1;i++)
{
if(a[i+1]-a[i]>1)
bool=true;
}
if(bool==true)
{
System.out.println("NO");
}
else 
{
System.out.println("YES");
}
}

}
}

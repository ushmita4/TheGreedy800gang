import java.io.*;
import java.util.*;
public final class giftfixing{
//public final
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0){
int n=sc.nextInt();
long c[]=new long[n],or[]=new long[n];long min_c=Long.MAX_VALUE,min_or=Long.MAX_VALUE;
for(int i=0;i<n;i++){
	c[i]=sc.nextInt();
	min_c=Math.min(min_c,c[i]);
}
for(int i=0;i<n;i++){
	or[i]=sc.nextInt();
	min_or=Math.min(min_or,or[i]);
}
long res=0L;
for(int i=0;i<n;i++)
	res+=Math.max(Math.abs(c[i]-min_c),Math.abs(or[i]-min_or));	
		
System.out.println(res);

t--;
}

}
}
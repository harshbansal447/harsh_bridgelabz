import java.util.*;
public class Calculator1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number");
int a=sc.nextInt();
System.out.print("Enter number");
int b=sc.nextInt();
System.out.println("Choose oerations");

System.out.println("for add");
System.out.println("for sub");

System.out.println("for mul");
System.out.println("for div");
int c=sc.nextInt();

if(c==1){
	int val = sum(a,b);
	System.out.print(val);
	
}
if(c==2){
	int val=sub(a,b);
	System.out.print(val);
}
if(c==3){
	int val=mul(a,b);
	System.out.print(val);
}
if(c==4){
	int val=div(a,b);
	System.out.print(val);
}
}
public static int sum(int a,int b){
	int res=a+b;
	return res;
	
	
}
public static int sub(int a,int b){
	int res=a-b;
	return res;
	
}
public static int mul(int a,int b){
	int res=a*b;
	return res;
}
public static int div(int a,int b){
	int res=a/b;
	return res;
}
}

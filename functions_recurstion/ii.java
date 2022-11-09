package functions_recurstion;

import java.util.Scanner;

public class ii {
	int x;
    static int digit(int num){
        int count = 0;
        while(num != 0){
            num = num/10;
            count++;
        }
        return count;
    }
	double CheckArm(int n,double a,int count){
	if(n!=0){
		x=n%10;
		a= (a+Math.pow(x,count));
		n/=10 ;
		return CheckArm(n,a,count);
	}
	return a;
	}
	public static void main(String[] arg)
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter start: ");
	int start = input.nextInt();
	System.out.println("Enter end: ");
	int end = input.nextInt();
	input.close();
	ii A=new ii();
	double arm;
	System.out.printf("Armstrong numbers between 1 to %d",end);
	for(;start<end;start++)
	{
	int count = digit(start);
	arm=A.CheckArm(start,0,count);
	if(arm==start)
	      System.out.println(start);
	}
	}
}

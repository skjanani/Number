package janani;
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,n1,a,b,sum=0;
		Scanner ja= new Scanner(System.in);
		System.out.println("Please enter n");
		n=ja.nextInt();
		System.out.println("Please enter n1");
		n1=ja.nextInt();
		int[] arr = new int[n];
		System.out.println("Please enter array elements");
		for(int k=0;k<n;k++)
			arr[k]=ja.nextInt();
		
		while(n>0)
		{
		System.out.println("Please enter A and B");
		a=ja.nextInt();
		b=ja.nextInt();		
		if(a>b)
		{
			int temp=a;
			a=b;
			b=temp;						
		}
		int i=1;
		while(i<=a)
		{
			if(a%i==0 && b%i==0)
				sum=i;
			i++;				
		}
		System.out.println(sum);
		n1--;
		}


	}

}

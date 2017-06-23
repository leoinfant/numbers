import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the digit of numbers:");
		int n=s.nextInt();
		int rn=0;
		int temp=0;
		while(n>0){
			temp=n%10;
			rn=rn*10+temp;
			n=n/10;
		}
		
		System.out.println(+rn);
	}

}

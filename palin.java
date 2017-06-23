package palindrom;
import java.util.Scanner;
public class palin {
public static void main(String args[])
{
	int original,reverse=0,remainder,oo;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number");
	original=in.nextInt();
	oo=original;
	while(original>0)
	{remainder=original%10;
	reverse=reverse*10+remainder;
	original=original/10;
	}
	if(oo==reverse)
	{
		System.out.println("The given no "+oo+" is palindrome");
	}
	else
	{
	System.out.println("The given no is not an palindrome");
}}
}

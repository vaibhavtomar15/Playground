import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner in=new Scanner(System.in);
      int num1=in.nextInt();
      int num2=in.nextInt();
      int num3=in.nextInt();
      int tempGCD=gcd(num1,num2);
      int finalGCD=gcd(tempGCD,num3);
      System.out.println(finalGCD);
	}
  public static int gcd(int a, int b)
  {
    if(b==0)
      return a;
    return gcd(b,a%b);
  }
}
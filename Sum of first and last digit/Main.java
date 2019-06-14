import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	    Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int last_digit=num%10;
      int first_digit=0;
      int temp=num;
      int count=0;
      int divisor=1;
      while(temp > 0)
      {
        temp=temp/10;
        divisor=divisor * 10; 
      }
     divisor=divisor/10;
      first_digit=num / divisor;
      int sum=first_digit+last_digit;
      System.out.println(sum);
    }
}
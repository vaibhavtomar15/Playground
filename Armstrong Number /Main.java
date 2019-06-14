import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int temp=num;
      int sum=0;
      while(temp>0)
      {
        int digit=temp%10;
        sum=sum + (digit*digit*digit);
        temp=temp/10;
      }
      if(sum==num)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");

        
	}
}
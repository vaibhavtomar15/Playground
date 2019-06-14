import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int temp=num;
      int fact=1;
      int factSum=0;
      while(temp>0)
      {
        int digit=temp%10;
        for(int i=digit;i>0;i--)
        {
          fact=fact*i;
        }
        factSum=factSum+fact;
        temp=temp/10;
        fact=1;
      }
      if(factSum==num)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}
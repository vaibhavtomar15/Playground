import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int temp=num;
      int i=0;
      int fact=1;
      while(i!=temp)
      {
        ++i;
        fact=num*fact;
        num--;
      }
      System.out.println(fact);
	}
}
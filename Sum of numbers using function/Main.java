import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int sum=Sum_of_Number(num);
      System.out.println(sum);
	}
  public static int Sum_of_Number(int n)
  {
    int sum=(n*(n+1))/2;
    return sum;
  }
}
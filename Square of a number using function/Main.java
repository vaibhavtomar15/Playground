import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int square=calSquare(num);
      System.out.println(square);
	} 
  public static int calSquare(int n)
  {
    int sq=n*n;
    return sq;
  }
}
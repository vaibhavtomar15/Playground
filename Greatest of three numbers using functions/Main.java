import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int tempGr=greater(n1,n2);
      int finalGr=greater(tempGr,n3);
      System.out.println(finalGr);
	}
  public static int greater(int a, int b)
  {
    if(a>b)
      return a;
    else
      return b;
  }
}
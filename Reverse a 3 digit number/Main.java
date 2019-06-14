import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int rev=num%10;
    num=num/10;
    int temp1=num%10;
    rev=(rev*10)+temp1;
    num=num/10;
    rev=(rev*10)+num;
    System.out.println(rev);
  }
}
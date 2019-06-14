import java.util.Scanner;
import java.io.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int temp=num;
    int div=1;
    while(temp > 0)
    {
      temp=temp/10;
      div=div*10;
    }
    div=div/100;
    num=num/div;
    int rem=num%10;
    System.out.println(rem);
  }
}
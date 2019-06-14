import java.util.Scanner;
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int base=in.nextInt();
    int exp=in.nextInt();
    int power=calPower(base,exp);
    System.out.println(power);
  }
  public static int calPower(int b,int ex)
  {
    int pow=1;
    while(ex>0)
    {
   
     pow=pow*b;
      
      ex--;
    }
    return pow;
  }
}
  
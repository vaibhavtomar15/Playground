import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int counter=1;
      for(int i=1;i<=num;i++)
      {
        for(int j=1;j<=num;j++)
        {
          System.out.print(counter);
        }
        counter++;
        System.out.println();
      }
	}
}
import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int count=1;
    for(int i=1;i<=num;i++)
    {

        System.out.println(count);
      count=count+2;
    }
	}
      
}
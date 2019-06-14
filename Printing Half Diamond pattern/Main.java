import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      
      for(int row_no=1;row_no<=num;row_no++)
      {
        for(int space=1;space<=num-row_no;space++)
        {
          System.out.print(" ");
        }
        for(int col_no=1;col_no<=((row_no*2)-1);col_no++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
	}
}
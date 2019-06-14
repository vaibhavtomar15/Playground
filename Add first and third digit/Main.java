import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int first_num=num/100;
      int third_num=num%10;
      int sum=first_num+third_num;
      System.out.println(sum);
	}
}
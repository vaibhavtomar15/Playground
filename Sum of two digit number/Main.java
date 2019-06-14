import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int first_num=num/10;
      int second_num=num%10;
      int sum=first_num+second_num;
      System.out.println(sum);
	}
}
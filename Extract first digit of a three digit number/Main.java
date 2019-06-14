import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int firstDigit=num/100;
      System.out.println(firstDigit);
	}
}
import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	  Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      prime(num);
	}
  public static void prime(int n)
  {
    int count=0;
    for(int i=2;i<=n;i++)
    {
      for(int j=i;j>=1;j--)
      {
        if(i%j==0)
        {
          count++;
        }
      }
        if(count==2)
          System.out.println(i);
      count=0;
      
    }
      

    
  }
  
}
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=in.nextInt();
    perfectBatch(arr,n);
  }
    public static void perfectBatch(int[] array, int len)
    {
      boolean flag=true;
      int batch_sum=array[0]+array[1]+array[2];
      for(int i=3;i<len;i=i+3)
      {
        int current_sum=array[i]+array[i+1]+array[i+2];
        if(current_sum != batch_sum)
          flag=false;
      }
      if(flag==true)
        System.out.println("Perfect Batch");
      else
        System.out.println("Not a Perfect Batch");
	
      
    }
  }

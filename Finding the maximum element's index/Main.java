import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n];
    //Input elements in array
    for(int i=0;i<n;i++)
      arr[i]=in.nextInt();
    findLargestElementIndex(arr,n);
   
  }
  public static void findLargestElementIndex(int array[], int len)
  {
    int largest=array[0];
    int largestIndex=0;
    for(int i=0;i<len;i++)
    {
      if(array[i]>largest)
      {
        largest=array[i];
        largestIndex=i;
      }
    }
    System.out.println(largestIndex);
    
  }
}
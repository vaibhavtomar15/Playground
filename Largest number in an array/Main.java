import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int[] arr=new int[arr_size];
      for(int i=0;i<arr_size;i++)
        arr[i]=in.nextInt();
      int largest=arr[0];
      
      //Finding largest
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]>largest)
          largest=arr[i];
      }
      System.out.println(largest);
      
    }
}
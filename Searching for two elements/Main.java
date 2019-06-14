import java.util.Scanner;
import java.util.Arrays;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int[] arr=new int[arr_size];
      for(int i=0;i<arr_size;i++)
        arr[i]=in.nextInt();
      int search_num_1=in.nextInt();
      int search_num_2=in.nextInt();
      int index_1=searchElem(arr,search_num_1,arr_size);
      int index_2=searchElem(arr,search_num_2,arr_size);
      System.out.println(index_1 +" \n" + index_2);
    }
  
  public static int searchElem(int array[], int numSearch, int len)
  {
    for(int i=0;i<len;i++)
    if(array[i]==numSearch)
        return i;
      return -1;
    }
    
  }

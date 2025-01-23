import java.util.*;
public class calculate_second_largest {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("array element:");
        
        for(int i = 0;i<size;i++)
        {
            System.out.print(+arr[i]+" ");
        }
        System.out.println();
        int temp;

        for(int i = 0;i<size;i++)
        {
            for(int j = i+1;j<size;j++)
            {
                if(arr[i]<arr[j])
                {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }

            } 
        }
        System.out.print("the second largest no is:"+arr[1]);// second largest number;
    }
    
}

import java.util.*;
class minmax
{
public static void main(String[]args)
{
Scanner a=new Scanner(System.in);
System.out.println("enter the no. of array elements");
int n=a.nextInt();
System.out.println("enter the array elements");
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=a.nextInt();
}
Arrays.sort(arr);
System.out.println("enter M value");
int M=a.nextInt();
System.out.println("enter N value");
int N=a.nextInt();
int max=arr[n-M];
int min=arr[N-1];
System.out.println("the min value is:"+min);
System.out.println("the max value is"+max);
int sum=min+max;
int diff=max-min;
System.out.println("the Sum:"+sum);
System.out.println("the Difference:"+diff);
}
}


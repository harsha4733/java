package harsha;
import java.util.*;
public class arrsqure {
	public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	int lower=input.nextInt();
	int upper= input.nextInt();
	for(int i=lower;i<=upper;i++)
	{
	 System.out.println("("+i+","+(i*i)+")");
	}
	}
}

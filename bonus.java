package harsha;
import java.util.*;
public class bonus {
	public static void main(String[]args) {
		Scanner a=new Scanner(System.in);
		double bonus=0;
		System.out.println("enter the Grade of Employee");
		char n=a.next().charAt(0);
		System.out.println("enter  Employee Salary");
		int s=a.nextInt();
		if(n=='a'||n=='A') 
		{
			bonus=s*(0.05);
			if(s<10000) 
			{
				bonus=s*(0.07);
			}
			System.out.println("Salary"+s);
			System.out.println("Bonus"+bonus);
			System.out.println("Total Amount to be paid"+(s+bonus));
		}
		if(n=='b'||n=='B')
		{
			bonus=s*0.10;
			if(s<10000)
			{
				bonus=s*0.12;
			}
			System.out.println("Salary"+s);
			System.out.println("Bonus"+bonus);
			System.out.println("Total Amount to be paid"+(s+bonus));
		}
		
	}

}

package harsha;
import java.util.*;
class bank {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the bank name");
		String str=input.nextLine();
		if(str.equals("sbi")||str.equals("SBI"))
		{
			double intrest=8.4;
			System.out.println("SBI rate of intrest:"+intrest);
		}
		else if(str.equals("icici")||str.equals("ICICI"))
		{
			double intrest=7.3;
			System.out.println("ICICI rate of intrest:"+intrest);
		}
		else if(str.equals("axis")||str.equals("AXIS"))
		{
			double intrest=9.7;
			System.out.println("AXIS rate of intrest:"+intrest);
		}
		else
		{
			System.out.println("invalid inputs");
		}
	}

}

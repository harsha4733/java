import java.util.*;
class personaldetails{
	void info()
	{
		Scanner as=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=as.nextLine();
		Scanner ph=new Scanner(System.in);
		System.out.println("Enter the phone number:");
		int phone=ph.nextInt();
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter address");
		String address=ac.next();
		
	}
}
class bookdetails
{
	void book()
	{
		Scanner b=new Scanner(System.in);
		System.out.println("Enter book name");
		String bookname=b.next();
		Scanner a=new Scanner(System.in);
		System.out.println("Enter Author name:");
		String author=a.next();
	}
}
class fine
{
	void fdetails()
	{
		Scanner da=new Scanner(System.in);
		System.out.println("Enter no.of days:");
		int days=da.nextInt();
	}
}
class lib
{
	public static void main(String[] args)
	{
		personaldetails i=new personaldetails();
		i.info();
		bookdetails j=new bookdetails();
		j.book();
		fine x=new fine();
		x.fdetails();
	}
}
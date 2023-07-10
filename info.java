class manage
{
void mans()
{
String studentname="harsha";
int reg=192011364;
String location="chennai";
System.out.println("Student Name:"+studentname);
System.out.println("Student Reg no. :"+reg);
System.out.println("Student Located in:"+location);
}
}

class book
{
void data()
{
String bookname1="the real yogi",bookname2="make it possible";
int time1=1,time2=3;
System.out.println("the Book1 is:"+bookname1);
System.out.println("the Book2 is:"+bookname2);
System.out.println("time to return book1  "+time1+"day");
System.out.println("time to return book2  "+time2+"days");
}
}

class info
{
public static void main(String[]args)
{
manage m=new manage();
m.mans();
book b=new  book();
b.data();
}
}



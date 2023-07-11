import java.util.*;
class stdusers{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.println("enter total no.of users"); 
int tusers=input.nextInt();
System.out.println("enter total no.of teaching staff");
int teachusers=input.nextInt();
int nonteach=teachusers/3;
int studusers=tusers-(teachusers+nonteach);
System.out.println("the total no.of student users are:"+studusers); 
}
}

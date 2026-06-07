/*class While
{
public static void main(String[]args)
{
int i=1;
while(i<=5)
{
System.out.println(i);
i++;
}
}
}*/
import java.util.Scanner;
class Password
{
public static void main(String[]args)
{
Scanner sc =new Scanner(System.in);
String password="java1234";
String input=" ";
while(!input.equals(password))
{
System.out.println("Enter password:");
input=sc.nextLine();
}
System.out.println("Access granted");
}
}

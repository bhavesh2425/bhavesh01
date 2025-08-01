import java.util.Scanner;
public  class string1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("plese enter your name:");
		String name = sc.nextLine();
		System.out.println("hello,"+name+"!");
		sc.close();
	}
}
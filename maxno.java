class maxno
{
	public static void main(String[] args)
	{
		int a=100,b=150,c=50;
		
		int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		
		System.out.println("Maximum number is:"+max);
	}
}
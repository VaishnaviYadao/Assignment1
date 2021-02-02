package Day1;

public class ReverseNo {
	
	public static void main(String[] args)
	{
		int Number=54321,reverse=0;
		while(Number != 0)
		{
			int remainder=Number % 10;
			reverse=reverse * 10 + remainder;
			Number=Number/10;
		}
		
		System.out.println("The reverse of given number is:" + reverse);
	}

}

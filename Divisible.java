package Day1;

public class Divisible {
	
	public static void main(String[] args)
	{
		int count=0;
		for(int i=1;i<1000;i++)
		{
			if(i%2==0 && i%3==0 && i%5==0)
			{
				System.out.println( i + "\t");
				count=count+1;
				if(count==5)
				{
					break;
				}
			}
		}
	}

}

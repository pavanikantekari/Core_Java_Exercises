

public class Pattern13 {

	public static void main(String args[])
	{
		int space = 1;
		space = 5 - 1;
		for (int i = 1; i<= 5; i++)
		{
			for (int j = 1; j<= space; j++)
			{
				System.out.print(" ");
			}
			space--;
			for (int j = 1; j <= 2 * i - 1; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

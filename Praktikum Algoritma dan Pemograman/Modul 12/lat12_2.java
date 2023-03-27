public class lat12_2 {
	public static void main(String args[])
	{
		int [] numbers={10,20,30,40,50};
		int x = 0;
		do
		{
			if(numbers[x]==30)
			break;
			System.out.println(numbers[x]);
			System.out.print("\n");
			x++;
		}
		while(x <= numbers.length);
	}
}

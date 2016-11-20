
public class Addition 
{
	//data
	int a = 10;
	int b = 20;
	int c;
	
	//method
	public void add()
	{
		c = a -(-b);
		//return c;
		System.out.println(c);
	}


public static void main(String[] args)
{
	//int d;
	Addition ad = new Addition();
	ad.add();
	
}

}
public class toStringDemo 
{
	public static void main(String[] args)
	{
		Box catBox = new Box(10,12,14); 
		String strBox = "box b: " +catBox ; 
		System.out.println(catBox);
		System.out.println(strBox);
	}
}

public class Box 
{
	double width, height, depth; 
	public void Box(double width, double height, doublw depth)
	{
		this.width = width; 
		this.height = height; 
		this.depth = depth; 
	}

	public String toString()
	{
		return ("dimensions are " + width + "by" + depth " . ");
	}
	 /* Author @raiprogramming - https://github.com/raiprograming */
}


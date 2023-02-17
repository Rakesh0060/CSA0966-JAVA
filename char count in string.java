import java.util.*;

class GFG{


static int cntDistinct(String str)
{
	HashSet<Character> s = new HashSet<Character>();

	
	for(int i = 0; i < str.length(); i++)
	{
		s.add(str.charAt(i));
	}
	return s.size();
}

public static void main(String args[])
{
	String str = "geeksforgeeks";
	System.out.print(cntDistinct(str));
}
}

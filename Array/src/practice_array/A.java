package practice_array;

public class A {
	
	public void palindrom(String s)
	{
		String s1 = "";
		int l = s.length();
		
		System.out.println(s);
		
		for(int i = l-1; i>=0; i--)
		{
			s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);
		
		if(s.equals(s1))
		{
			System.out.println("It's Palindrom");
		}
		else
		{
			System.out.println("It's not Palindrom");
		}

		
	
	
	
	
	
	
	}
	
}
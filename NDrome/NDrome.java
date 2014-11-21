/*An N-Drome is a string that is the same forwards and backwards when split into n-character units.
For example, a string would be a 1-drome if and only if it were a standard palindrome.
An example of a 2-drome would be abcdab since its 2-character units are ab, cd, and ab, and its first and last 2-character units are identical.
*/

package NDrome;


public class NDrome {

	public static void main(String[] args)
	{
		String s = "abcdab|2";
		String[] parts = s.split("\\|");
		int n = Integer.parseInt(parts[1]);
	
		if(n==1)	
		{
			//Check for palindrome
			StringBuffer sb = new StringBuffer(parts[0]);
			String reverse = sb.reverse().toString();
			
			if(reverse.equals(parts[0]))
				System.out.println(parts[0]+"|1");	
			else
				System.out.println(parts[0]+"|0");
		}
	
		else
		{
			int length = parts[0].length();
			String first = parts[0].substring(0, n);
			String second = parts[0].substring(length-n, length);
			if(first.equals(second))
				System.out.println(parts[0]+"|1");
			else System.out.println(parts[0]+"|0");;
			
		}
	}

}

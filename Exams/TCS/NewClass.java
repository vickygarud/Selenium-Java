package TCS;


	
	// Java program to find the count
	// of k length substrings with k
	// distinct characters using
	// sliding window
	import java.util.*;

	public class NewClass {

	// Function to return the
	// required count of substrings
	public static int countSubstrings(String str,
									int K)
	{
		int N = str.length();
		
		// Store the count
		int answer = 0;

		// Store the count of
		// distinct characters
		// in every window
		Map<Character,
			Integer> map = new HashMap<Character,
									Integer>();

		// Store the frequency of
		// the first K length substring
		for(int i = 0; i < K; i++)
		{
			
			// Increase frequency of
			// i-th character
			if (map.get(str.charAt(i)) == null)
			{
				map.put(str.charAt(i), 1);
			}
			else
			{
				map.put(str.charAt(i),
				map.get(str.charAt(i)) + 1);
			}
		}

		// If K distinct characters
		// exist
		if (map.size() == K)
			answer++;

		// Traverse the rest of the
		// substring
		for(int i = K; i < N; i++)
		{

			// Increase the frequency
			// of the last character
			// of the current substring
			if (map.get(str.charAt(i)) == null)
			{
				map.put(str.charAt(i), 1);
			}
			else
			{
				map.put(str.charAt(i),
				map.get(str.charAt(i)) + 1);
			}
			
			// Decrease the frequency
			// of the first character
			// of the previous substring
			map.put(str.charAt(i - K),
			map.get(str.charAt(i - K)) - 1);

			// If the character is not present
			// in the current substring
			if (map.get(str.charAt(i - K)) == 0)
			{
				map.remove(str.charAt(i - K));
			}

			// If the count of distinct
			// characters is 0
			if (map.size() == K)
			{
				answer++;
			}
		}

		// Return the count
		return answer;
	}

	// Driver code
	public static void main(String[] args)
	{
		
		// string str
		String str = "aeiou";

		// integer K
		int K = 2;

		// Print the count of K length
		// substrings with k distinct characters
		System.out.println(countSubstrings(str, K));
	}
	}

	// This code is contributed by grand_master



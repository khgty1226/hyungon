package hyungon.submit03;

public class Submit03 {

	public static void main(String[] args) {
		
		System.out.println("\n====================문제 1 ==================\n");
	
		// 10 * 9 * 8----
		
		int result = 1;
		for(int i = 0 ; i < 10 ; i ++) {
			result *= (10-i);
			// 1    *   10-0
			// 1   * 10-1
			// 1   * 8
		}
		System.out.println(result);
		
		long lonresult = 1;
		
		for(int i = 0 ; i < 15 ; i ++) {
			lonresult *= (15-i);
		}
		System.out.println(lonresult);
		
		
		
		System.out.println("\n====================문제 2 ==================\n");
		
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		int wallyCount = 0;
		
		for(int i = 0; i < findWally.length()-1 ; i++)
		{
			if(findWally.substring(i, i+2).equals("월리")){
				wallyCount ++;
			}
		}
		
		System.out.println(wallyCount);
		
		
		System.out.println("\n====================문제 3 ==================\n");

		String stars = "*****";
		
		for(int i = 0; i < 5 ; i++) {
			System.out.println(stars.substring(0, 5-i));
		}
		
		
		
	}

	
}

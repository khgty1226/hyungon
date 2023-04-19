package hyungon.submit05;

public class Submit05 {

	public static void main(String[] args) {

		System.out.println("\n====================문제 1 =====================\n");
		
		makeTree(5);
		makeTree(7);
		
		System.out.println("\n====================문제 @ =====================\n");
		
		String myBinaryStr = makeBinary(23);
		System.out.println(myBinaryStr);
				
		System.out.println("\n====================문제 2 =====================\n");
		
		String example = "로꾸꺼 로꾸꺼";
		String result = reverseStr(example);
		System.out.println(result);
	}
	
	
	public static String reverseStr(String str) {
		String reverseStr = "";
		
		for(int i = 0 ; i < str.length(); i++) {
			reverseStr += str.substring(str.length()-(i+1), str.length()-i);
		}
		
		return reverseStr;
		
	}
	
	public static String makeBinary(int num) {
		String binary = "";
		String temp = "";
		
		while (num > 0) {
			binary += Integer.toString(num % 2) ;
			num /= 2;
		}
		
		for(int i = 0 ; i < binary.length(); i++) {
			temp += binary.substring(binary.length()-(i+1), binary.length()-i);
		}
		
		binary = temp;
		return binary;
		
	}
	
	public static void makeTree(int n) {
	
		for(int i = 0; i < n ; i++) {  // i = 0 ~ n
			
			String space = "";
			String star = "";
			
			for(int j = 0 ; j < n-i-1 ; j++) {  // i = 0 ; j = 4 -> 0 (5회) 
			space += " ";
			}
			
			for( int k = 0 ; k < 2*(i+1)-1 ; k++) {
				star += "*";
			}
		
		System.out.println(space + star);
		
	}
}
}
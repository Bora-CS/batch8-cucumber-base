package interviewCodeExample;

public class ReverseString {

	public static void main(String[] args) {
		
		reverseString("I got a job with 100K");
		reverseString_2("I got a job with 100K");


//		String msg = "I got a job with 100K";
//
//		char[] msgArr = msg.toCharArray();
//
//		for (int i = msgArr.length - 1; i >= 0; i--) {
//
//			System.out.print(msgArr[i]);
//		}

	}
	public static void reverseString(String text) {
		
		String[] texts = text.split("");
		
			for (int i = texts.length-1; i >=0; i--) {
				System.out.print(texts[i]);
				
			}
	}
	
	public static void reverseString_2(String text) {
		for (int i = text.length()-1; i >=0; i--) {
			System.out.print(text.charAt(i));
		}
	}
		

}


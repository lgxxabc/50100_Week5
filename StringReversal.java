package Week5;

public class StringReversal {
	//-----------------------------------------------------------------
	//	Creates a recursive method that accepts a String s and returns 
	//  a new String in reverse order
	//-----------------------------------------------------------------
	
	public String reverseString(String s) {
		if (s == null || s.length() <= 1) {
			return s;
		}
		char[] array = s.toCharArray();	// String --> char
		reverseHelper(array, 0, array.length - 1);
		return new String(array);
	}
	
	private void reverseHelper(char[] array, int left, int right) {
		if (left >= right) {
			return;
		}
		swap(array, left, right);
		reverseHelper(array, left + 1, right - 1);
	}
	
	private void swap(char[] array, int i, int j) {
		char tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	
	public static void main(String[] args) {
		// Normal case
		String s = "Good morning.";
		StringReversal rev = new StringReversal();
		String result = rev.reverseString(s);
		System.out.println(result);
		
		// s.length() <= 1
		s = "T";
		result = rev.reverseString(s);
		System.out.println(result);
		
		// s == null
		s = null;
		result = rev.reverseString(s);
		System.out.println(result);
	}
}

//Outputs:
//	.gninrom dooG
//	T
//	null
	
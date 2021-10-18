package week3.day2;

public class IndexOfCharacterInString {

	public static void main(String[] args) {
		String text="Java Exercise";
		
		//to get position of Particular character in the string
		System.out.println("Index of E :" +text.indexOf('E')); 
		System.out.println("Index of s :" +text.indexOf('s'));
		
		//to get the index of all the characters in the string
		char[] charArr = text.toCharArray(); 
		for(int i=0;i<charArr.length;i++) {
			System.out.println("charArr["+i+"]:"+charArr[i]);
		}

	}

}

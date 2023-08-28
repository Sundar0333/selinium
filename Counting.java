package week3.day2;

public class Counting {

	public static void main(String[] args) {
		String s1="TestLeaf";
		int count=0;
		char[] charArray = s1.toCharArray();
		
		for(int i=0; i<charArray.length-1;i++) {
			if(charArray[i]=='e') {
				count++;
				
				
			}
		}
		System.out.println(count);
	}

}

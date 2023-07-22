package NACodingQuestions;

public class VowelsConsonantsCount {

	public static void main(String[] args) {
		
		String str = "prasad";
		char[] ch = str.toCharArray();	
		int vCount=0;
		int conCount=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
				vCount++;
			else 
				conCount++;
		}
		System.out.println("Total Number of vowels in the given string are "+ vCount);
		System.out.println("Total Number of Consonants in the given string are "+ conCount);

	}

}

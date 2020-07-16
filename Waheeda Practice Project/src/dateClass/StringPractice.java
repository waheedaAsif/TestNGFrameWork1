package dateClass;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String st1 = "elephante";
		String st2 = new String ("elephant");
		
		// method length will return the size of the string/number of characters
		System.out.println(st1.length());
		
		// method charAt will return a character at the specified index
		System.out.println(st1.charAt(2));
		
		// indexOf will return the index number of the first occurrence of the character
		System.out.println(st1.indexOf('e'));
		System.out.println(st1.indexOf('e', 2));
		// looking for the e letter all over the letter and show in console by giving as the index number.
		System.out.println("ant" );
		
		// subString method will return a specified section of the String
		System.out.println(st1.substring(3));
		System.out.println(st1.substring(1, 2));
		
		// so I want to return "ant" from string st1 without any hard coded value except "ant"
		System.out.println(st1.substring(st1.indexOf("ant"), st1.indexOf("ant")+ "ant".length()).
				toUpperCase().indexOf('A'));
		
		// toLowerCase and toUpperCase methods change the case of the chars
		System.out.println(st1.toLowerCase());
		System.out.println(st1.toUpperCase());
		
		//equals compare two strings while considering the case of character
		  System.out.println(st1.equals(st2));
		//equalsIgnoreCase compare two strings while NOT considering the case of characters
		  System.out.println(st1.equalsIgnoreCase(st2));
		 
		// startsWith will check to see if the string is starting with the specified string
		  System.out.println(st1.startsWith("e"));
		  
		// endsWith will check to see if the string is ending with the specified string
		  System.out.println(st1.endsWith("nt"));
		  
		// method contains will check to see if the string contains the specified string in it 
		  System.out.println(st1.contains("ant"));
		  
		//replace will take a char or a String and if it find it in the actual String, 
		  //then it will replace it to the specified String or char
		 System.out.println(st1.replace('e', 'a'));
		 System.out.println(st1.replace("pha","AHP"));
		 
		 //trim removes the spaces before and after the string
		 System.out.println(st1.trim());
	}

}

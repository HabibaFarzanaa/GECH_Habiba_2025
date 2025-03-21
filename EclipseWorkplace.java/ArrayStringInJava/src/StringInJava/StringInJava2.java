package StringInJava;

public class StringInJava2 {
	public static void main(String[] args) {
		/*
		 * 1.equlas
		 * 2.==
		 * 3. cancat
		 * 4.touppercase
		 * 5.tolowercase
		 * 6.
		 * 7.trim
		 * 8.
		 * 9.startswith
		 * 10.endswith
		 * 11.strip
		 * 12.isBlank()
		 * 
		 * 
		*/
		
		String str1 = new String("  Hello World  ");
		String str2 = new String("hello world");
//		1. equals
		System.out.println("equals: " +str1.equals(str2));
		
//		2.equalsignorecase
		System.out.println("equalsIgnoreCase: " +str1.equalsIgnoreCase(str2));
		
//		3. ==
		System.out.println("== :" +(str1 == str2));
		
//		4.concat
		System.out.println("Concat:" +(str1.concat(" ").concat(str1).concat("hi")));
		
//		5.touppercase
		System.out.println("touppercase:" +str1.toUpperCase());
		
//		6.tolowercase
		System.out.println("to lower case:" +str1.toLowerCase());
		
//		7.trim
		System.out.println("trim:" +str1.trim());
		
//		8.strip
		System.out.println("strip:" +str1.strip());
		
//		9.isblank
		System.out.println("isblank:" +str1.isBlank());
		
//		10.startswith
		System.out.println("startswith:" +str1.startsWith(str2));
		
//		11.endswith
		System.out.println("Endswith:" +str1.endsWith(str1));
			
		}
		
	}


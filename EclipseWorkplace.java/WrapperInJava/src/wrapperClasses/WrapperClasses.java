package wrapperClasses;

public class WrapperClasses {

	public static void main(String[] args) {
		/*
		 * Java is a pure oop or not
		 * -->No (because it has primitive data type which are not the objects
		 * 
		 * primitive data type :
		 * -->byte, short, int, long, char, float, double, boolean
		 * 
		 * Non primitive data type;
		 * String 
		 * -->we create the string using new keyword which is a class :
		 * -------------------------------------------------------------------
		 * Collection:
		 * ->To store group of individual objects as a single entity
		 * ->It only work for the object not for the primitive data types
		 * 
		 * 10, 20, 30,40 -> int (primitive data type)
		 * 
		 * -------------------------------------------------------------------
		 * WRAPPER CLASSES:
		 * -> Wrapping the primitive datatypes
		 * byte --> Byte
		 * short --> Short
		 * int --> Integer
		 * long --> Long
		 * float --> Float
		 * double --> Double
		 * boolean --> Boolean
		 * char --> Char
		 * eg: Byte[] bt = new Byte[10];
		 * -------------------------------------------------------------------------
		 * 2 method to use wrapper class
		 * 
		 *1. Auto Boxing:
		 * 
		 */	
		
		
		// 1. Auto Boxing:--> form primitive to wrapper
		int a =100;
//		explicit conversion
		Integer i = Integer.valueOf(a);
		
//		implicit conversion
//		Integer i = a;
		System.out.println("Int:" + a);
		System.out.println("Integer :" +i);
		System.out.println("Integer Type :" +i.getClass().getName());
		
		//2. unboxing
		
		Integer i1 = 30;
		
		int a1 = i1;
		System.out.println("Int:" + a1);
		System.out.println("Integer :" +i1);
		System.out.println("Integer Type :" +i1.getClass().getName());
		
		System.out.println("---------------------Byte---------------------------------");
		byte a3 =100;
//		explicit conversion
		Byte i3 = Byte.valueOf(a3);
		
//		implicit conversion
//		Byte i3 = a3;
		System.out.println("byte:" + a3);
		System.out.println("Byte :" +i3);
		System.out.println("Byte Type :" +i3.getClass().getName());
		
		Byte i4 = 30;
		
		byte a4 = i4;
		System.out.println("byte:" + a4);
		System.out.println("Byte :" +i4);
		System.out.println("Byte Type :" +i4.getClass().getName());
	}

}

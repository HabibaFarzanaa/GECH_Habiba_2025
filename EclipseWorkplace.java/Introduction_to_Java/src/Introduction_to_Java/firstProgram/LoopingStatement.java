package Introduction_to_Java.firstProgram;

public class LoopingStatement {

	public static void main(String[] args) {

		/*
		 * for loop 
		 * syntax:for(intialization; condition;  inc/dec)
		 * eg: for(int i=0; i<=5;  i++)
		 *  
		 * while loop
		 * syntax
		 * while(cond){
		 * 	inc/dec
		 * }
		 * eg:
		 * while(i<9){
		 * 	i++;
		 * }
		 * 
		 * do-while loop
		 * syntax:
		 * do{
		 * 	statements
		 * }while(cond);
		 * 
		 * syntax:
		 * do{
		 * 	a+b
		 * }while(a<b);
		 * 
		 * for each loop
		 * for (<datatype> variable_name : collection){
		 * }
		*/
		
		int [] array1 = {10,20,30,40,50,60};
		int j=0;                  
		while(j < array1.length) {
			System.out.println(array1[j]);
			j++;
			
		}
		
		
//		for(int i=0; i<array1.length; i++) {
//			System.out.println(i);
//		}
		
		
//		FOR EACH LOOP
//		for(int a:array1) {
//			System.out.println(a);
//		}
		
	}

}

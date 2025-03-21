package ArrayStringInJava.arrays;

public class TwoDArray {
	public static void main(String[] args) {
	int [][] arr = new int[2][2];
	arr[0][0] = 3;
	arr[0][1] = 3;
	arr[1][0] = 3;
	arr[1][1] = 3;

	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			System.out.print(arr[i][j]+ " ");
		}
		System.out.println();
}
}
}
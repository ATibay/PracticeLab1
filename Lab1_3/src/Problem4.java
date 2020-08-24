
public class Problem4 {

	public static void main(String[] args) {
		getSquare(3, 10);
	}
		static void getSquare(int n) {
			for(int i = 0; i < n || i == n; i++) {
				System.out.println("The square of " + i +" is " + i*i);
			}
		}
		
		static void getSquare(int i, int n) {
			if(i < n || i == n) {
				System.out.println("The square of "+  i + ", " + i*i);
				getSquare(i + 1,n);
			}else {
				return; 
			}
		}
	

}

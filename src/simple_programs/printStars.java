package simple_programs;

public class printStars {

	
	public static void printingStars() {
		
		for(int i=1;i<=5;++i) {
			//System.out.println(i);
			for(int j=1;j<=i;++j) {
				//System.out.println(i);
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		
	}
	public static void main(String[] args) {
		printingStars();

	}

}

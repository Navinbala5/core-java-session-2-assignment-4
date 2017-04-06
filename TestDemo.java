import java.util.Scanner;

public class TestDemo {
	 	int i;

	 public void B(int i)
	 		{
	 			
	 			if(i==0)
	 			{
	 				System.out.println("you have entered zero");
	 				
	 			}
	 			else if(i<0)
	 			{
	 				System.out.println("you have entered a negative value");
	 			}
	 			else
	 			{
	 				System.out.println("you have entered a positive value");
	 			}
	 			
	 		}	

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number");
		int i=scan.nextInt();
		TestDemo t= new TestDemo();
		t.B(i);
	}
	
}

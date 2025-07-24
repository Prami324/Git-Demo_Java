
public class JavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while loop
		int i = 5;
		while (i > 0) {
			System.out.println(i);
			System.out.println(i);
			System.out.println(i);
			
			i--;
		}

		int j = 10;
		do {
			System.out.println(j); // 1 loop execution is gurantee even the condition is false.
			j++;

		} while (j > 30);

		for (int k = 0; k < 10; k = k + 3) {
			if (k == 9)
				System.out.println(" 9 is displayed");
			else
				System.out.println("I didnot find");//
		}
		
		
		for(int a=1;a<=4;a++)
		{
			System.out.println("Outer loop started");
			for(int b=1;b<=4;b++)
			{
				System.out.println("inner loop");   //for 1 outer loop, 4 inner loop should be executed
			}
			System.out.println("Outer loop finished");
			
		}
		
	
		
		
		

	}

}

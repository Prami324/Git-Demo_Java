
public class pyramidtype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=1;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);  //print means printing in same line
				System.out.print("\t");  //\t means giving space
				k++;
			}
			
			System.out.println(""); //println means printing in separate line
		}
		
	
		for(int a=1;a<5;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(b);
				System.out.print("\t");
				
			}
			System.out.println("");
		}
		
		
		int k2=1;
		for(int a=1;a<4;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(k2*3);
				k2++;
				System.out.print("\t");
				
			}
			System.out.println("");
		}
		
		
		int k1=1;
		for(int c=0;c<=4;c++)
		{
			for(int d=1;d<=4-c;d++)
			{
				System.out.print(k1);  //print means printing in same line
				System.out.print("\t");  //\t means giving space
				k1++;
			}
			
			System.out.println(""); //println means printing in separate line
		}
		

	}

}

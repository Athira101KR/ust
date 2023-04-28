
//INCOMPLETE!!!!!!!!!

package tryCatch;

class InputCheck1 extents Exception{

	void calculatePercentage(int x,int y)
	{
		if(x<y && y==8)
			throw new DenominatorException("Input 1 must be gratre than input 2");
		else
			System.out.println("Percentage:"+(x/y)*100);
			
	}
}

public class InputCheck {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputCheck1 in=new InputCheck1();
		try
		{
			in.calculatePercentage(10,5);
		}
		catch(DenominatorException de)
		{
			System.out.println(de.getMessage);
		}
		catch(Exception ex)
		{
			System.out.println("Handles any exception");
		}
		
	}

}

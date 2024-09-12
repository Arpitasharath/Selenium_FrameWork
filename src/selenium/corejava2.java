package selenium;

public class corejava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr2= {1,2,3,5,6,10,12,22};
		
		//multiples of 2
		for (int i=0; i<arr2.length; i++)
		{
			if(arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				break;//exit the for loop
			}
			else
			{
				System.out.println(arr2[i] + "is not multiple of 2");
	
			}
			
			for (int l= arr2.length-1;l>=0;l--)
			{
				System.out.println("elements in reverse order :"  + arr2[l]);
			}
		}
		
	}

}

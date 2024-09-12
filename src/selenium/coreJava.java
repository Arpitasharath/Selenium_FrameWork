package selenium;

public class coreJava {

	public static void main(String[] args) {
	
		int myNum = 5;
		String web="Rahul shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard= true;
		
		System.out.println(myNum + "value stored in myNum");
		System.out.println(dec);
		
		int[] arr = new int[5];
		arr[0]= 3;
		arr[1]= 8;
		arr[2]=9;
		arr[3]=10;
		arr[4]=12;
		
		System.out.println(arr[3]);
		
		int[] arr2= {1,2,3,5,6};
		 System.out.println (arr2[0]);
		 
		 String[] name = {"arpita","rahul","disha"};
		 
		 //For loop
		 
		 for(int i=0; i< arr.length; i++)
		 {
			 System.out.println (arr[i]);
		 }
		 
		 for(int j=0; j< name.length; j++)
		 {
			 System.out.println(name[j]);
		 }
		 
		 //enhanced for loop syntax
		 for (String s:name)
		 {
			 System.out.println(s); 
		 }
	}

}

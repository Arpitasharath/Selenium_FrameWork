package TestNG;

import org.testng.annotations.Test;

public class sampleTest {

	@Test(priority = 1)
	public void createProduct()
	{
		System.out.println("Product as been created Successfully");
	}
	
	@Test(priority = 2)
	public void modifyProduct()
	{
		System.out.println("Product as been modified Successfully");
	}
	
	@Test(priority = 0)
	public void deleteProduct()
	{
		System.out.println("product as been deleted successfully");
	}

}

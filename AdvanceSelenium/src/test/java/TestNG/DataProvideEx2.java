package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideEx2 {
	
	
	@Test(dataProvider = "dataProvider_BookTickets")
	public void bookTickets(String src, String dest, int ppl)
	{
		System.out.println("Book Ticket from"+src+ "to" +dest+ "," +ppl+ "");
	}
	
@DataProvider
	public Object[][] dataProvider_BookTickets()
	{
		Object[][] objArr = new Object[2][3];
		
		objArr[0][0]="Bangalore";
		objArr[0][1] = "Goa";
		objArr[0][2] =5;
		
		objArr[1][0]="Bangalore";
		objArr[1][1] = "Mysore";
		objArr[1][2] =3;
		
		
		return objArr;
	}
}
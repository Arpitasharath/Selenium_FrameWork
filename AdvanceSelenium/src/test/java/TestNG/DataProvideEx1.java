package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DataProvideEx1 {
//DataProvider--Executing same method/script multiple times with different set of data
//return type:Returns two Dimentional Object Array

	//Booking bus ticktes
	
@Test(dataProvider = "dataProvider_BookTickets")
	public void bookTickets(String src, String dest)
	{
		System.out.println("Book Ticket from"+src+ "to" +dest+ "");
	}
	
@DataProvider
	public Object[][] dataProvider_BookTickets()
	{
		Object[][] objArr = new Object[3][2];
		
		objArr[0][0]="Bangalore";
		objArr[0][1] = "Goa";
		
		objArr[1][0]="Bangalore";
		objArr[1][1] = "Mysore";
		
		objArr[2][0]="Bangalore";
		objArr[2][1] = "Manglore";
		
		return objArr;
	}
}

package Generic_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class File_Utility {
	
	/**
	 * This method is used to read the data from properties file
	 * @param Key
	 * @return
	 * @throws Throwable
	 * @author arpita
	 */

	public String getPropertiesData(String Key) throws Throwable

	{

		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\vtiger.properties");

		// step2:create an object to properties class to load all the key
		Properties pro = new Properties();
		pro.load(fis);

		// step3:read the value using getProperty()
		String value = pro.getProperty(Key);
		return value;

	}

}

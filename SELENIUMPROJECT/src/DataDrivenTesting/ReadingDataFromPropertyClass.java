package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromPropertyClass {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./testdata/configuration.properties");
	Properties property = new Properties();
	property.load(fis);
	System.out.println(property.getProperty("url"));
	System.out.println(property.getProperty("un"));
	System.out.println(property.getProperty("pwd"));	
}
}

// 2nd this package will be created and this is to load the properties

// input para-- file format
//purpose of method-- to load properties file
//output para-- object of property clss
package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesHandle {
	public static Properties loadPropertiesFile(String filepath) throws IOException
	{
		File f=new File(filepath);
		FileInputStream fs= new FileInputStream(f);
		Properties pr=new Properties();//represents sets of properties
		pr.load(fs);
		return pr;
		
	}
}

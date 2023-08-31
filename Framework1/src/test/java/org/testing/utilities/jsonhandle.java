// 4 create this to read the json file
//utilities will contain all files
package org.testing.utilities;
//input para-- json file path
//purpose of method-- read any json file
//output-- json data in string format
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class jsonhandle {
	public static String loadjsonfile(String filepath) throws FileNotFoundException
	{
		File f=new File(filepath);
		FileInputStream fi=new FileInputStream(f);
		JSONTokener tj=new JSONTokener(fi);
		JSONObject jb=new JSONObject(tj);
		return jb.toString();
	}
}

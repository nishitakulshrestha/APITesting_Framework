package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingUsingOrgJson {
	public static String JsonParse(String ResponseData, String KeyName)
	{
		if (ResponseData.startsWith("["))
		{
		JSONArray array=new JSONArray(ResponseData);
		System.out.println("The value of all "+KeyName+" is: ");
		int L= array.length();
		for (int i=0;i<L;i=i+1)
		{
			JSONObject obj=array.getJSONObject(i);
			System.out.println(obj.get(KeyName));
		}
		return null;
		
	}
		else if(ResponseData.startsWith("{"))
		{
			JSONObject j= new JSONObject(ResponseData);
			String responseID=j.getString(KeyName);
			return responseID;
		}
		return null;

}
}

package org.testing.utilities;

import java.util.regex.Pattern;

//input para-> complete request body,variablename,variable value
//purpose of method-> to assign the value to the parameter
//output-> replaced value
public class jsonReplacement {
	public static String assignVariableValue(String requestBody,String variableName, String variableValue)
	{
		requestBody=requestBody.replaceAll(Pattern.quote("{{"+variableName+"}}"),variableValue);
		 //data=data.replaceAll(Pattern.quote("{{"+"id"+"}}"),id.toString());
		 return  requestBody;
	}}
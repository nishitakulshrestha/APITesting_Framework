//5 to insert the body data 
package org.testing.teststeps;

import java.util.Properties;

import org.testing.testScripts.TC1_postrequest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
//input para-- request body, uri value--> from the properties
public class HTTPMethods {
Properties pr;
public HTTPMethods(Properties pr)//constructor
{
	this.pr=pr;
}
public Response postMethod(String requestBody, String uriKeyName)
{
	String uriValue=pr.getProperty(uriKeyName);
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(requestBody).when().post(uriValue);
	//System.out.println("status code is" +res.statusCode());
	System.out.println("Testcase 1 POST response is"+res.asString());
	return res;
	
}
// For TC2 creating get method
public Response getMethod(String uriKeyName)
{
	String uriValue=pr.getProperty(uriKeyName);
	Response res=
	given()
	.contentType(ContentType.JSON)
	.when().get(uriValue);
	//System.out.println("status code is" +res.statusCode());
	System.out.println("------------------------------------------------");
	System.out.println("Testcase 2 GET response is"+res.asString());
	System.out.println(("_______________________________________________"));
	return res;
	
}

//FOR TESTCASE 3

public Response getParticularmethod(String uriKeyName, String endPoint)
{
	String uriValue=pr.getProperty(uriKeyName)+"/"+endPoint;
	Response res=
	given()
	.contentType(ContentType.JSON)
	.when().get(uriValue);
	//System.out.println("status code is" +res.statusCode());
	System.out.println("------------------------------------------------");
	System.out.println("Testcase 3 GET response is"+res.asString());
	System.out.println(("_______________________________________________"));
	return res;
	
}
// for TC4 update request

public Response putMethod(String requestBody, String uriKeyName,String endpoint)
{
	String uriValue=pr.getProperty(uriKeyName)+"/"+endpoint;
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(requestBody).when().put(uriValue);
	//System.out.println("status code is" +res.statusCode());
	System.out.println("Testcase 4 PUT response is"+res.asString());
	return res;
	
}
// TC 5 Delete
public Response Deletemethod(String uriKeyName, String endPoint)
{
	String uriValue=pr.getProperty(uriKeyName)+"/"+endPoint;
	Response res=
	given()
	.contentType(ContentType.JSON)
	.when().delete(uriValue);
	//System.out.println("status code is" +res.statusCode());
	System.out.println("------------------------------------------------");
	System.out.println("Testcase 5 -> value is deleted "+res.asString());
	System.out.println(("_______________________________________________"));
	return res;
	
}

	
}


package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.propertiesHandle;

import io.restassured.response.Response;

public class TC5_Delete {
	public void testcase5() throws IOException
	{
		Properties pr= propertiesHandle.loadPropertiesFile("../Framework1/URI.properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response res= http.Deletemethod("URI_1",TC1_postrequest.returnidvalue);
	
	}
}

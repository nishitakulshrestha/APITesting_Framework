package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.propertiesHandle;

import io.restassured.response.Response;

public class TC3_getparticularID {
	public void testCase3() throws IOException
	{
		Properties pr= propertiesHandle.loadPropertiesFile("../Framework1/URI.properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response res= http.getParticularmethod("URI_1",TC1_postrequest.returnidvalue);
	}

}

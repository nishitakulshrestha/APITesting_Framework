package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.propertiesHandle;

import io.restassured.response.Response;

public class TC2_getAllRequest {
	public void testcase_2() throws IOException {
		Properties pr= propertiesHandle.loadPropertiesFile("../Framework1/URI.properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response res= http.getMethod("URI_1");
		JsonParsingUsingOrgJson.JsonParse(res.asString(), "id");
		//JsonParsingUsingOrgJson.JsonParse(res.asString(), "firstname");
	}
}

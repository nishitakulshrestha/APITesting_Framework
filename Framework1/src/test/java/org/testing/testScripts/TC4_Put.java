package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.jsonReplacement;
import org.testing.utilities.jsonhandle;
import org.testing.utilities.propertiesHandle;

import io.restassured.response.Response;

public class TC4_Put {
	
	public void testcase4() throws IOException {
		Properties pr= propertiesHandle.loadPropertiesFile("../Framework1/URI.properties");
		//using utility 1
		String requestBody=jsonhandle.loadjsonfile("../Framework1/src/test/java/org/testing/resources/updateRequestPayload.json");
		
		requestBody=jsonReplacement.assignVariableValue(requestBody, "id", TC1_postrequest.returnidvalue);
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.putMethod(requestBody,"URI_1",TC1_postrequest.returnidvalue);
		
	}

}

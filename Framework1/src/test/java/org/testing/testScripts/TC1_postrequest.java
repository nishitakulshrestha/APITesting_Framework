//6 testcase
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

public class TC1_postrequest {
	public static String returnidvalue;
	public void testcase1() throws IOException {
		Properties pr= propertiesHandle.loadPropertiesFile("../Framework1/URI.properties");
		//using utility 1
		String requestBody=jsonhandle.loadjsonfile("../Framework1/src/test/java/org/testing/resources/requestpayload.json");
		//using utility 2
		//generating random value for id so that can be call continoulsy without changing the id value manually
		Random r=new Random();
		Integer idValue=r.nextInt();
		//System.out.println(idValue);
		requestBody=jsonReplacement.assignVariableValue(requestBody, "id", idValue.toString());
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.postMethod(requestBody,"URI_1");
		returnidvalue=JsonParsingUsingOrgJson.JsonParse(res.asString(), "id");
	}

}

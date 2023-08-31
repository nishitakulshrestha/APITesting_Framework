package org.testing.trigger;

import java.io.IOException;

import org.testing.testScripts.TC1_postrequest;
import org.testing.testScripts.TC2_getAllRequest;
import org.testing.testScripts.TC3_getparticularID;
import org.testing.testScripts.TC4_Put;
import org.testing.testScripts.TC5_Delete;

public class Runner {
	public static void main(String[] args) throws IOException {
		TC1_postrequest TC_1=new TC1_postrequest();
		TC_1.testcase1();
		TC2_getAllRequest TC_2= new TC2_getAllRequest();
			TC_2.testcase_2();
			TC3_getparticularID TC_3= new TC3_getparticularID();
			TC_3.testCase3();
			TC4_Put TC_4= new TC4_Put();
			TC_4.testcase4();
			TC5_Delete TC_5= new TC5_Delete();
			TC_5.testcase5();
			
		
	}

}

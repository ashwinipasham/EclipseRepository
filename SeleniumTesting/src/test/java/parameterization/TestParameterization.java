package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {

	@Test(dataProvider="getData")
	public void doLogin(String username, String password){
		
		System.out.println(username +"-------"+ password);
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "trainer@automation.com";
		data[0][1] = "sdAASD"; 
		
		data[1][0] = "java@automation.com";
		data[1][1] = "sjsdj"; 
		
		data[2][0] = "corporate@automation.com";
		data[2][1] = "smSAD.j"; 
						
		return data;
		
	}
}

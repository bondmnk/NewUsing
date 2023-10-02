package ShopperLogin;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class Login2Test extends BaseClass{

	@Test(groups = "SmokeTest")
	public void Tc_Login_003() {
		System.out.println("third test case");
	}
	
	@Test(groups = "RegrationTest")
	public void Tc_Login_004() {
		System.out.println("four test case");
	}
	
	@Test(groups = {"RegrationTest","SmokeTest"})
	public void Tc_Login_005() {
		System.out.println("five test case");
	}
}

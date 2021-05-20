/**
 * @author: Della Li  Email: lyfyxy66@gmail.com
 * @date: April 30, 2021
 * @methodsName: UNameInputTestAST
 * @description: input the user name and check the output welcome result
 * @param: 
 * @return: 
 * @throws: 
 **/

package basicweb;

import basicweb.UserNameGenerate;
import basicweb.base;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class UNameInputTestAST extends base {

	@Before
	public void setUp() throws Exception {
		super.startBrowser();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		super.closeBrowser();
	}

	@Test
	public void test() throws Exception {		
		int i;
		for(i=1; i<=2; i++) {
			String userName = UserNameGenerate.getUserName();
			System.out.println("UserName " + i + " is:" + userName);
			
			driver.findElement(By.name("name")).sendKeys(userName);
			Thread.sleep(3000);
			
			driver.findElement(By.name("button")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.name("name")).clear();			
		}

	}


}

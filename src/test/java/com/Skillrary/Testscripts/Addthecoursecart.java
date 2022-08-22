package com.Skillrary.Testscripts;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Skillrary.PomPages.AddCart;
import com.Skillrary.PomPages.Login;
import com.Skillrary.genericlib.Baseclass;

@Listeners(com.Skillrary.genericlib.ActionListners.class)
public class Addthecoursecart extends Baseclass{
	@Test
	public void addtocart() throws InterruptedException {
		test=reports.createTest("addtocart");
		Login l=new Login(driver);
		utilies.mouseHover(driver,l.getCourseTab());
		l.clickCource();
		AddCart c=new AddCart(driver);
		utilies.doubleClick(driver,c.getPlusbtn());
		c.addtocartBtn();
		utilies.alert(driver);
		
	}

}

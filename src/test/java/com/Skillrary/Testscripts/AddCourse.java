package com.Skillrary.Testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Skillrary.PomPages.AddCart;
import com.Skillrary.PomPages.Login;
import com.Skillrary.PomPages.SkillraryLogin;
import com.Skillrary.genericlib.Baseclass;

import com.aventstack.extentreports.ExtentTest;

public class AddCourse extends Baseclass{
	
	
	@Test
	public void addingcourse() {
		test=reports.createTest("addingcourse");
	SkillraryLogin s=new SkillraryLogin(driver);
      Login l = s.demoApp();
   utilies.switchtab(driver);
		utilies.mouseHover(driver,l.getCourseTab());
		AddCart c = l.clickCource();
		c.addtocartBtn();
		
	}

}

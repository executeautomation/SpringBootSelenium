package com.ea.SpringStart;

import com.ea.SpringStart.pages.HomePage;
import com.ea.SpringStart.pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Profile;

import java.util.List;

@SpringBootTest(classes = SpringStartApplication.class)
@Profile("second")
class SpringStartApplicationTests {

	@Autowired
	private HomePage homePage;

	@Value("${app.url}")
	private String appUrl;

	@Value("chrome,firefox,edge")
	private List<String> browsers;

	@Value("testing")
	private String environment;

	@Test
	void contextLoads1() {
		System.out.println(appUrl);
//		homePage.Navigate(appUrl);
//		homePage.ClickLogin();
//		loginPage.Login("admin", "password");
//		loginPage.ClickLogin();
	}

	@Test
	void contextLoads2() {
		System.out.println(appUrl);
//		homePage.Navigate(appUrl);
//		homePage.ClickLogin();
//		loginPage.Login("admin", "password");
//		loginPage.ClickLogin();
	}


	@Test
	void contextLoads3() {
		System.out.println(appUrl);
//		homePage.Navigate(appUrl);
//		homePage.ClickLogin();
//		loginPage.Login("admin", "password");
//		loginPage.ClickLogin();
	}


	@Test
	@Profile("!qa")
	void contextLoads() {


		System.out.println(appUrl);
//		homePage.Navigate(appUrl);
//		homePage.ClickLogin();
//		loginPage.Login("admin", "password");
//		loginPage.ClickLogin();
	}

}
